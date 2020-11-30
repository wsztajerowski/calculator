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
        // given
        int firstDigit = 1;
        int secondDigit = 3;

        // when
        int actual = sut.add(firstDigit, secondDigit);

        // then
        assertEquals(4, actual);
    }

    @Test
    void throws_illegal_argument_exception_when_dividing_by_zero(){
        // given
        int firstDigit = 1;
        int secondDigit = 0;

        // when
        Exception actual = assertThrows(RuntimeException.class, () -> sut.divide(firstDigit, secondDigit));

        // then
        assertAll("Division by zero exception",
                () -> assertTrue(actual.getMessage().contains("by zero")),
                () -> assertEquals(IllegalArgumentException.class, actual.getClass())
        );
    }

}