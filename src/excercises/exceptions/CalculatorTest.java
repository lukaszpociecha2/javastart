package excercises.exceptions;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.getData();
        try {
            System.out.println(calculator.calculate());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            calculator.getData();
            calculator.calculate();
        }
    }

}
