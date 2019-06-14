package pl.symentis.calculator;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class ExtendedObjectCalculatorAssert {
    public ExtendedObjectCalculatorAssert(ObjectCalculator actual) {
    }

    public static ExtendedObjectCalculatorAssert assertThat(ObjectCalculator actual) {
        return new ExtendedObjectCalculatorAssert(actual);
    }

    public ExtendedObjectCalculatorAssert hasValueDifferentThan(int value) {

        return this;
    }

    public ExtendedObjectCalculatorAssert hasPositiveValue() {
        return this;
    }
}
