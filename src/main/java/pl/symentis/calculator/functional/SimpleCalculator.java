package pl.symentis.calculator;

public class SimpleCalculator {
    public SimpleCalculator(){}

    public int add(int firstDigit, int secondDigit){
        return firstDigit + secondDigit;
    }

    public int substract(int firstDigit, int secondDigit){
        return firstDigit - secondDigit;
    }

    public int multiply(int firstDigit, int secondDigit){
        return firstDigit * secondDigit;
    }

    public int divide(int firstDigit, int secondDigit){
        if (secondDigit == 0){
            throw new IllegalArgumentException("You cannot divide by zero!");
        }
        return firstDigit / secondDigit;
    }
}
