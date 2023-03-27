package ch6.ex26;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number for inverse: ");
        int value = scanner.nextInt();

        System.out.printf("number is: %d", inverse(value));
    }

    private static int inverse(int value) {
        int result = 0;
        while (value > 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        return result;
    }
}
