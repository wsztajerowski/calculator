package pl.symentis.calculator.object;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static pl.symentis.calculator.object.ExtendedObjectCalculatorAssert.assertThat;

@DisplayNameGeneration(ReplaceUnderscores.class)
class ObjectCalculatorServiceTest {

    private ObjectCalculatorService sut;
    private CalculatorRepository calculatorRepository;

    @BeforeEach
    void beforeEach(){
        calculatorRepository = mock(CalculatorRepository.class);
        sut = new DefaultObjectCalculatorService(calculatorRepository);
    }

    @Test
    void load_calculator_returns_object_with_saved_value(){
        // given
        String name = "My results";
        ObjectCalculator calculator = new ObjectCalculator(5);
        when(calculatorRepository.load(name)).thenReturn(calculator);

        // when
        ObjectCalculator savedCalculator = sut.load(name);

        // then
        assertThat(savedCalculator)
            .isNotNull()
            .hasValue(5);
    }

}