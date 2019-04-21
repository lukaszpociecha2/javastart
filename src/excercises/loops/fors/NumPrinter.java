package excercises.loops.fors;

public class NumPrinter {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= 10; i++) {
            //if (i == 5) return;
            System.out.println(i);
            if (i == 5) return;
        }
    }


}
