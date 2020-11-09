package pl.symentis.calculator;

public interface CalculatorRepository {
    void save(String name, ObjectCalculator calculator);

    ObjectCalculator load(String name);
}
