package pl.symentis.calculator.object;

import com.devskiller.jfairy.Fairy;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.stream.Stream.*;
import static java.util.stream.Stream.concat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@IntegrationTest
class ObjectCalculatorIT {
    private ObjectCalculator sut;
    private static Fairy fairy;

    @BeforeAll
    static void beforeAll(){
        fairy = Fairy.create();
    }

    @BeforeEach
    void beforeEach(){
        sut = new ObjectCalculator();
    }

    @Test
    void add_one_to_three_returns_four(){
        // given
        sut
                .init(1);

        // when
        int actual = sut
                .add(3)
                .getCurrentValue();

        // then
        assertThat(actual)
                .isPositive()
                .isEqualTo(4);
    }

    @ParameterizedTest(name = "Divide {0} by 0 throw an exception!")
    @ValueSource(ints = {-1, 0, 1, 4})
    void throws_illegal_argument_exception_when_dividing_by_zero(int value){
        // given
        sut = new ObjectCalculator(value);

        // when
        Throwable thrown = catchThrowable(() -> sut.divideBy(0));

        // then
        assertThat(thrown)
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("by zero!")
            .hasNoCause();
    }

    @ParameterizedTest(name = "[{index}]: Result of multiplication [{0} times {1}] is positive")
    @DisplayName(value = "Multiplication numbers with same sign returns positive result")
    @MethodSource("multiplicationElements")
    void multiplication_of_two_numbers_with_same_sign_returns_positive_number(int firstNumber, int secondNumber){
        // given
        sut = new ObjectCalculator();

        // when
        ObjectCalculator actual = sut
            .init(firstNumber)
            .multiplyBy(secondNumber);

        // then
        ExtendedObjectCalculatorAssert.assertThat(actual)
            .hasValueDifferentThan(0)
            .hasPositiveValue();
    }


    static Stream<Arguments> multiplicationElements() {
        Supplier<Integer> randomPositive = getIntegerSupplier(1, 1_000);
        Supplier<Integer> randomNegative = getIntegerSupplier(-1_000, -1);
        return concat(
                createStream(randomPositive, 5),
                createStream(randomNegative, 5)
        );
    }

    private static Stream<Arguments> createStream(Supplier<Integer> randomPositive, int limit) {
        return generate(() -> arguments(randomPositive.get(), randomPositive.get()))
                .limit(limit);
    }

    private static Supplier<Integer> getIntegerSupplier(int min, int max) {
        return () -> fairy
                .baseProducer()
                .randomBetween(min, max);
    }
}