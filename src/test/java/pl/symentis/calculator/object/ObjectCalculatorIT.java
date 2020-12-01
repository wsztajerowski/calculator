package pl.symentis.calculator.object;

import com.devskiller.jfairy.Fairy;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.function.Supplier;
import java.util.stream.Stream;

@IntegrationTest
class ObjectCalculatorIT {
    private ObjectCalculator sut;
    private static Fairy fairy;

    @BeforeAll
    static void beforeAll() {
        fairy = Fairy.create();
    }

    @Test
    void add_one_to_three_returns_four() {
        // you can use ObjectCalculator#init method to set initial calculator state
        // and ObjectCalculator#getCurrentValue to obtain current calculator's value
        // also: use core AssertJ assertions to check if result is a positive number and equal to expected value
    }

    @ParameterizedTest
    void throws_illegal_argument_exception_when_dividing_by_zero(int value) {
        // set proper test's execution name
        // try to use simplest possible source
        // use catchThrowable method to capture the exception and verify if exception has proper type,
        // has no cause and it's message contains string "by zero!"
    }

    @ParameterizedTest
    void multiplication_of_two_numbers_with_same_sign_returns_positive_number(int firstNumber, int secondNumber) {
        // set display name and proper test's execution name
        // use ExtendedObjectCalculatorAssert
    }


    static Stream<Arguments> multiplicationElements() {
        Supplier<Integer> randomPositive = getIntegerSupplier(1, 1_000);
        Supplier<Integer> randomNegative = getIntegerSupplier(-1_000, -1);
        // you can use Stream#concat and Stream#generate to create stream of number pairs with the same sign
        Stream<Arguments> stream = null;
        return stream;
    }

    private static Supplier<Integer> getIntegerSupplier(int min, int max) {
        return () -> fairy
            .baseProducer()
            .randomBetween(min, max);
    }
}