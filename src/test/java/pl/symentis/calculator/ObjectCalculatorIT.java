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

    void add_one_to_three_returns_four(){
    }

    void throws_illegal_argument_exception_when_dividing_by_zero(int value){
    }

    void multiplication_of_two_numbers_with_same_sign_returns_positive_number(int firstNumber, int secondNumber){
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