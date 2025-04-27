package se.branko;

public class CalculatorService {

    Calculator calculator = new Calculator();



    public double safeDivide(double a, double b) {
        if( b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return calculator.divide(a, b);
    }
}
