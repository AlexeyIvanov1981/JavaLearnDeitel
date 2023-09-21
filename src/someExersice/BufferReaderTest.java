package someExersice;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("data/test.txt"));
            for (;;){
                String line = bufferedReader.readLine();
                if (line == null)
                    break;
                stringBuilder.append(line + "\n");

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(stringBuilder);
    }
}
