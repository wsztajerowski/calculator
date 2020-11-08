package pl.symentis.calculator;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class ExtendedObjectCalculatorAssert extends AbstractAssert<ExtendedObjectCalculatorAssert, ObjectCalculator> {
    public ExtendedObjectCalculatorAssert(ObjectCalculator actual) {
        super(actual, ExtendedObjectCalculatorAssert.class);
    }

    public static ExtendedObjectCalculatorAssert assertThat(ObjectCalculator actual) {
        return new ExtendedObjectCalculatorAssert(actual);
    }

    public ExtendedObjectCalculatorAssert hasValueDifferentThan(int value) {
        isNotNull();

        if (actual.getCurrentValue() == value) {
            failWithMessage("Expected calculator current value to be different than <%s> but was the same", value);
        }

        return this;
    }

    public ExtendedObjectCalculatorAssert hasPositiveValue() {
        isNotNull();

        Assertions.assertThat(actual.getCurrentValue())
                .overridingErrorMessage("Current value [%s] has to be a positive number!", actual.getCurrentValue())
                .isPositive();
        return this;
    }
}
