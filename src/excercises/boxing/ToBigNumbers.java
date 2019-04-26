package excercises.boxing;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class ToBigNumbers {

    public static void main(String[] args) {

        String fileName = "numbers.txt";
        File file = new File(fileName);
        try (Scanner scanner = new Scanner(file);){
            while (scanner.hasNextLine()){
                String temp = scanner.nextLine();
                if(temp.length()>5){
                    BigInteger bigInteger = new BigInteger(String.valueOf(temp));
                    System.out.println(bigInteger + bigInteger.getClass().getName());
                } else {
                    int integer = Integer.parseInt(temp);
                    System.out.println(integer);

                }

            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }



    }

}
