package pl.symentis.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@IntegrationTest
class ObjectCalculatorIT {
    private ObjectCalculator sut;

    @Test
    void add_one_to_three_returns_four(){
        // given
        sut = new ObjectCalculator();

        // when
        int actual = sut
                .init(1)
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

    @ParameterizedTest(name = "Result of multiplication [{arguments}] is positive")
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
        return Stream.of(
                arguments(-1, -3),
                arguments(2, 4),
                arguments(-1, -1),
                arguments(3, 3),
                arguments(20, 300)
        );
    }
}