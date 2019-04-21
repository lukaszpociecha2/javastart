package excercises.algorithms;

import java.util.Scanner;

public class CheckSum {

    static int sum;

    public static void getSum() {
        System.out.println("Podaj dowolną ilość liczb mniejszcyh od 100");
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        sum = 0;
       /* while ((temp=scanner.nextInt())<100){
            sum+=temp;
        }*/

        for(temp = scanner.nextInt(); temp <= 100; temp = scanner.nextInt()) {
            sum += temp;
        }

        scanner.close();
        System.out.println("Suma wprowadzonych liczb mniejszych niż 100 = " + sum);

    }

    public static boolean checkSum(){
        if (sum%2==0) return true;
        else return false;

    }

}
