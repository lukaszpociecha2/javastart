package excercises.string;

public class StringTest {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append(i);
            stringBuilder.append(" ");
        }
        String numbers = stringBuilder.toString();
        System.out.println(numbers);
    }



}
