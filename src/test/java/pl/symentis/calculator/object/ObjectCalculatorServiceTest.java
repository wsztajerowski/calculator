package pl.symentis.calculator.object;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(ReplaceUnderscores.class)
class ObjectCalculatorServiceTest {

    private ObjectCalculatorService sut;
    private CalculatorRepository calculatorRepository;

    @Test
    void load_calculator_returns_object_with_saved_value(){
        // use FakeCalculatorRepository as a repository implementation
        // remember to separate read and write paths
        // use Extended assertion to verify returned object's value
        // verify also if returned value is different than "0"
    }

}