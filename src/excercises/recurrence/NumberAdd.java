package excercises.recurrence;

public class NumberAdd {

    public static void main(String[] args) {
        int number = sum(50);
        System.out.println(number);
    }

    static int sum(int n) {
        if (n > 1) {
            System.out.println(n + "+" + "sum(" + (n - 1) + ")");
            return n + sum(n - 1);
        } else {
            return n;
        }
    }

}
