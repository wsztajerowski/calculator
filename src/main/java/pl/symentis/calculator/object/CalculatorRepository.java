package pl.symentis.calculator.object;

public interface CalculatorRepository {
    void save(String name, ObjectCalculator calculator);

    ObjectCalculator load(String name);
}
