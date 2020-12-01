package pl.symentis.calculator.object;

public class ExtendedObjectCalculatorAssert {
    public ExtendedObjectCalculatorAssert(ObjectCalculator actual) {
    }

    public static ExtendedObjectCalculatorAssert assertThat(ObjectCalculator actual) {
        return new ExtendedObjectCalculatorAssert(actual);
    }

    public ExtendedObjectCalculatorAssert hasValueDifferentThan(int value) {
        // remember that you have to verify if actual object is not null
        // use if statement and failWithMessage method

        return this;
    }

    public ExtendedObjectCalculatorAssert hasPositiveValue() {
        // use core assertions for numbers with overridingErrorMessage

        return this;
    }

    public ExtendedObjectCalculatorAssert hasValue(int expectedValue) {
        // use core assertions and "as" method

        return this;
    }
}
