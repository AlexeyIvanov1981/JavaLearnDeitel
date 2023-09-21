package someExersice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileInputStream is = new FileInputStream("data/test.txt");
            for (;;){
                int code = is.read();
                if (code < 0)
                    break;
                char ch = (char) code;
                stringBuilder.append(ch);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException exception){
            exception.printStackTrace();
        }

        System.out.println(stringBuilder.toString());
    }

}
