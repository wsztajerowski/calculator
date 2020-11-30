package pl.symentis.calculator.functional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@Tag("unitTest")
@DisplayNameGeneration(ReplaceUnderscores.class)
class SimpleCalculatorTest {

    private SimpleCalculator sut;

    @BeforeEach
    void setUp(){
        sut = new SimpleCalculator();
    }

    @Test
    void add_one_to_three_returns_four(){
        // given
        int firstDigit = 1;
        int secondDigit = 3;

        // when
        int actual = sut.add(firstDigit, secondDigit);

        // then
        assertEquals(4, actual);
    }

    @Test
    void throws_illegal_argument_exception_when_dividing_by_zero(){
        // given
        int firstDigit = 1;
        int secondDigit = 0;

        // when
        Exception actual = assertThrows(RuntimeException.class, () -> sut.divide(firstDigit, secondDigit));

        // then
        assertAll("Division by zero exception",
                () -> assertTrue(actual.getMessage().contains("by zero")),
                () -> assertEquals(IllegalArgumentException.class, actual.getClass())
        );
    }

    @ParameterizedTest(name = "[{index}]: {0} times {1}")
    @MethodSource
    void verify_commutative_property_of_multiplication(int factorA, int factorB){
        // when
        int productAB = sut.multiply(factorA, factorB);
        // and
        int productBA = sut.multiply(factorB, factorA);

        // then
        assertEquals(productAB, productBA);
    }

    private static Stream<Arguments> verify_commutative_property_of_multiplication() {
        return Stream.of(
                arguments(-1, 3),
                arguments(5, 4),
                arguments(-10, 10),
                arguments(2, 0),
                arguments(0,0)
        );
    }

}