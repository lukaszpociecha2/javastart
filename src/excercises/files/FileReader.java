package excercises.files;

import jdk.nashorn.internal.ir.WhileNode;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.io.*;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) {
        String nameFile = "./src/excercises/files/names2.txt";

        File file = new File(nameFile);

        // z wykorzystaniem Scannera, ale malo wydajny bo stala i mala wielkosc bufora

        /*int lines = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(scanner.hasNextLine()){
            lines++;
            System.out.println(lines + " " + scanner.nextLine());

        }
        scanner.close();*/

        java.io.FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String nextLine = null;
        try {
            fileReader = new java.io.FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            while ((nextLine = bufferedReader.readLine()) != null) {
                System.out.println(nextLine);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // try-with-resources - do korzystania z zasobow (I/O, DB) nie wymaga zamykania jesli implementują interface AutoClosable

        try (java.io.FileReader fr = new java.io.FileReader(file); BufferedReader br = new BufferedReader(fr);) {


        } catch (IOException e) {

        }

        // w JAVA 9 nie trzeba deklarować resources w try-with-resources() - można wcześniej, a w () podać ich zmienne;

    }

}