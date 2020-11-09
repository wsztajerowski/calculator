package pl.symentis.calculator;

import org.junit.jupiter.api.Test;

class ObjectCalculatorServiceTest {

    @Test
    void load_calculator_returns_object_with_saved_value(){
        // given
        CalculatorRepository repository = new FakeCalculatorRepository();
        repository.save("My results", new ObjectCalculator(5));
        ObjectCalculatorService sut = new DefaultObjectCalculatorService(repository);

        // when

        // then

    }

}