package pl.symentis.calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@Tag("unitTest")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SimpleCalculatorTest {

    private SimpleCalculator sut;

    @BeforeEach
    void setUp(){
        sut = new SimpleCalculator();
    }

    @Test
    void add_one_to_three_returns_four(){
    }

    @Test
    void throws_illegal_argument_exception_when_deviding_by_zero(){
    }

}