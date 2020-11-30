package pl.symentis.calculator.object;

public class ObjectCalculator {
    private int currentValue;

    public ObjectCalculator(int initValue){
        currentValue = initValue;
    }

    public ObjectCalculator(){
        currentValue = 0;
    }

    public ObjectCalculator resetValue(){
        currentValue = 0;
        return this;
    }

    public ObjectCalculator init(int newValue){
        currentValue = newValue;
        return this;
    }

    public ObjectCalculator add(int value){
        currentValue += value;
        return this;
    }

    public ObjectCalculator substract(int value){
        currentValue -= value;
        return this;
    }

    public ObjectCalculator multiplyBy(int value){
        currentValue *= value;
        return this;
    }

    public ObjectCalculator divideBy(int value){
        if (value == 0){
            throw new IllegalArgumentException("You cannot divide by zero!");
        }
        currentValue /= value;
        return this;
    }

    public int getCurrentValue(){
        return currentValue;
    }
}
