package pl.symentis.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectCalculatorServiceTest {



    @Test
    void load_calculator_returns_object_with_saved_value(){
        // given
        CalculatorRepository repository = new FakeCalculatorRepository();
        repository.saveCalculator(new ObjectCalculator(5));
        ObjectCalculatorService sut = new DefaultObjectCalculatorService(repository);

        // when


        // then

    }

}