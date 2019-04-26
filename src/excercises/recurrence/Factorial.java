package excercises.recurrence;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(4));

    }

    static int factorial(int i){

        /*if(i>1){
            i = i*Factorial(i-1);
        } else {
            return 1;
        }

        return i;*/

        return i>1 ? i=i* factorial(i-1) : 1;
    }


}
