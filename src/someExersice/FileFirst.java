package someExersice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileFirst {
    public static void main(String[] args) {

        try (InputStream inputStream = new FileInputStream("Data/test.txt");
             OutputStream outputStream = new FileOutputStream("Data/test2.txt")) {

            byte[] buffer = new byte[4096];
            int r = inputStream.read(buffer);
            while (r != -1) {
                outputStream.write(buffer, 0, r);
                r = inputStream.read(buffer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
