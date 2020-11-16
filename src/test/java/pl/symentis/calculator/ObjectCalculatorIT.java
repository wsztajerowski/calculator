package pl.symentis.calculator;

import com.devskiller.jfairy.Fairy;
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
    private static Fairy fairy;

    void add_one_to_three_returns_four(){
        // use core AssertJ assertions for integers
    }

    void throws_illegal_argument_exception_when_dividing_by_zero(int value){
        // use AssertJ's catchThrowable - verify if exception's message contains string: "by zero",
        // is instance of IllegalArgumentException and has no causes
    }

    void multiplication_of_two_numbers_with_same_sign_returns_positive_number(int firstNumber, int secondNumber){
        // set proper test execution name
        // verify if result if different than "0" and it's a positive number
        // use jfairy to generate 5 pairs of positive numbers (for simplicity in a range 1...1_000)
        // and 5 pairs of negative numbers ( -1_000...-1)
    }


    static Stream<Arguments> multiplicationElements() {
        // use Stream.generate, Stream.concat and jfairy's base producer
        return null;
    }
}