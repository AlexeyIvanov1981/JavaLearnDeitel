package ch5.boWhileTest;

public class DoWhileTest {
    public static void main(String[] args) {
        int counter = 100;
        char a = 100;

        do {
            System.out.printf("%d-%s ", counter, a);
            ++counter;
            ++a;
        } while (counter <= 110);
        System.out.println();
    }
}
