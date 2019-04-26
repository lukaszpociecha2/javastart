package excercises.recurrence;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {




    static void showDirectories(File file){
        File[] fileList = file.listFiles();
        for (File file1 : fileList) {
            if (file1.isDirectory()){
                System.out.println(file1.getAbsolutePath());
                showDirectories(file1);
            } else {
                System.out.println(file1.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {

        File file = new File("/home/lukasz/test");
        /*File[] files  = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getAbsolutePath());
        }*/


        showDirectories(file);

        /*File file2 = new File("/home/lukasz/test/test_level_1_A/test_level_2A");
        Arrays.stream(file2.listFiles()).forEach(f->{
            System.out.println(f.getAbsolutePath());
        });*/

    }

}
