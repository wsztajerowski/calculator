package pl.symentis.calculator.object;

public class DefaultObjectCalculatorService implements ObjectCalculatorService {
    private final CalculatorRepository calculatorRepository;

    public DefaultObjectCalculatorService(CalculatorRepository repository) {
        calculatorRepository = repository;
    }

    @Override
    public ObjectCalculator load(String name) {
        return calculatorRepository
                .load(name);
    }
}
