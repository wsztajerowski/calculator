package pl.symentis.calculator.functional;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@Tag("unitTest")
class SimpleCalculatorTest {

    private SimpleCalculator sut;
    // create system under test object outside of test methods
    // set display name generator

    @Test
    void add_one_to_three_returns_four() {
    }

    @Test
    void throws_illegal_argument_exception_with_message_contains_by_zero_when_dividing_by_zero() {
        // use assertThrows to catch exception and then assertAll to wrap multiple assertions
    }

    @ParameterizedTest
    void verify_commutative_property_of_multiplication(int factorA, int factorB) {
        // commutation low: A * B = B * A
        // set proper test's execution name and utilize data provider method
    }

    private static Stream<Arguments> verify_commutative_property_of_multiplication() {
        return Stream.of(
            arguments(-1, 3),
            arguments(5, 4),
            arguments(-10, 10),
            arguments(2, 0),
            arguments(0, 0)
        );
    }

}