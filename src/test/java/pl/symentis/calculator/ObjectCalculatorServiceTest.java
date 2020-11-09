package pl.symentis.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.Test;

import static pl.symentis.calculator.ExtendedObjectCalculatorAssert.assertThat;

@DisplayNameGeneration(ReplaceUnderscores.class)
class ObjectCalculatorServiceTest {

    private ObjectCalculatorService sut;
    private CalculatorRepository calculatorRepository;

    @BeforeEach
    void beforeEach(){
        calculatorRepository = new FakeCalculatorRepository();
        sut = new DefaultObjectCalculatorService(calculatorRepository);
    }

    @Test
    void load_calculator_returns_object_with_saved_value(){
        // given
        String name = "My results";
        calculatorRepository.save(name, new ObjectCalculator(5));

        // when
        ObjectCalculator savedCalculator = sut.load(name);

        // then
        assertThat(savedCalculator)
            .isNotNull()
            .hasValue(5);
    }

}