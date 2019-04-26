package excercises.interfaces;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorOne calculatorOne = new CalculatorOne();

        System.out.println(calculatorOne.calculateAr(calculatorOne.getShapeFromUser()));
    }
}
