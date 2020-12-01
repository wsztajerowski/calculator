package pl.symentis.calculator.object;

import java.util.HashMap;
import java.util.Map;

public class FakeCalculatorRepository implements CalculatorRepository {
    private Map<String, ObjectCalculator> storage = new HashMap<>();

    @Override
    public void save(String name, ObjectCalculator calculator) {
        storage.put(name, calculator);
    }

    @Override
    public ObjectCalculator load(String name) {
        return storage.get(name);
    }
}
