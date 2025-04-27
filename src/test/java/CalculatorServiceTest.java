
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.branko.calculator.Calculator;
import se.branko.calculator.CalculatorService;

import static org.junit.jupiter.api.Assertions.*;



public class CalculatorServiceTest {


    @Test
    public void additionTest() {

        Calculator calculator = new Calculator();

        double result = calculator.add(2,2);
        assertEquals(4, result);
    }

    @Test
    public void subtractionTest() {
        Calculator calculator = new Calculator();

        double result = calculator.sub(5,2);
        assertEquals(3, result);
    }

    @Test
    @DisplayName("Multiplying two numbers and show/get result")
    public void multiplicationTest() {

        Calculator calculator = new Calculator();

        double result = calculator.multi(5,5);
        assertEquals(25, result);
    }

    @Test
    @DisplayName("Dividing two numbers and get the result")
    public void divisionTest() {
        Calculator calculator = new Calculator();

        double result = calculator.divide(10,2);
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Dividing by 0 and throw ArithmeticException")
    public void safeDivisionTest() {
        CalculatorService calculatorService = new CalculatorService();

        assertThrows(ArithmeticException.class, () ->{
           calculatorService.safeDivide(2,0);
        });
    }

    @Test
    @DisplayName("Adding two decimal numbers to cause round up error and then handling it with delta")
    public void floatingPointAddition() {
        Calculator calculator = new Calculator();
        double result = calculator.add(0.1, 0.2);
        assertEquals(0.3, result, 0.00001); //Måste tillåta en lite skillnad (delta) vanligt med float, avrundningsfel
    }

}
