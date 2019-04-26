package excercises.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {

        String fileName = "./src/excercises/files/names2.txt";
        File file = new File(fileName);

        try (FileWriter fileWriter = new FileWriter(file, true); // remember the 'append' flag
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
            bufferedWriter.write("Ania");
            bufferedWriter.newLine();
            bufferedWriter.write("Hania");
            bufferedWriter.newLine();

        } catch (IOException e) {

        }

    }

}
