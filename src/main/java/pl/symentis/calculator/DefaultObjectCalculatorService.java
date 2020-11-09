package pl.symentis.calculator;

public class DefaultObjectCalculatorService implements ObjectCalculatorService {
    private final CalculatorRepository calculatorRepository;

    public DefaultObjectCalculatorService(CalculatorRepository repository) {
        calculatorRepository = repository;
    }
}
