package someExersice;

import java.io.File;

public class WorkWithFile {

    public static void main(String[] args) {
        File file = new File("data/test.txt");
        File directory = new File("src");

//        System.out.println(file.length());
//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());
//
//        System.out.println(directory.length());
//        System.out.println(directory.isFile());
//        System.out.println(directory.isDirectory());

        File[] files = directory.listFiles();

        for (File file1 : files){
            System.out.println(file1.getAbsolutePath());
        }
    }
}
