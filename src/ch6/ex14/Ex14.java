package ch6.ex14;

import java.util.Scanner;

public class Ex14 {
    public static int exponentiation(int base, int exponent) {
        int result = base;

        for (int i = 1; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter exponent number: ");
        int exponent = scanner.nextInt();

        System.out.print("Result = " + exponentiation(base, exponent));
    }
}
