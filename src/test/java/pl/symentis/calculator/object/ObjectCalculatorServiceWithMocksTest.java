package pl.symentis.calculator.object;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(ReplaceUnderscores.class)
class ObjectCalculatorServiceWithMocksTest {

    private ObjectCalculatorService sut;
    private CalculatorRepository calculatorRepository;

    @Test
    void load_calculator_returns_object_with_saved_value() {
        // implement same logic as in ObjectCalculatorServiceTest#load_calculator_returns_object_with_saved_value
        // but using mockito instead of fake implementation
    }

}