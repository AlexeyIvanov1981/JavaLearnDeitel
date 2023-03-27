package ch6.ex21;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        calculateTheIntegerPart(a, b);
        System.out.println();
        calculateTheIntegerRemainder(a, b);
        System.out.println();

        System.out.print("Enter digits from 0 to 9999: ");
        int digits = scanner.nextInt();

        displayDigits(digits);

    }

    static void calculateTheIntegerPart(int a, int b) {
        System.out.printf("%d - ", a / b);
    }

    static void calculateTheIntegerRemainder(int a, int b) {
        System.out.printf("%d - ", a % b);
    }

    static void displayDigits(int digits) {
        if (digits >= 0 && digits < 10) {
            System.out.printf("%d ", digits);
        }
        if (digits >= 10 && digits < 100) {
            int a = digits / 10;
            int b = digits % 10;
            System.out.printf("%d %d ", a, b);
        }
        if (digits >= 100 && digits < 1000) {
            int a = digits / 100;
            int b = digits / 10 % 10;
            int c = digits % 10;
            System.out.printf("%d %d %d ", a, b, c);
        }
        if (digits >= 1000 && digits < 10000) {
            int a = digits / 1000;
            int b = digits / 100 % 10;
            int c = digits / 10 % 10;
            int d = digits % 10;
            System.out.printf("%d %d %d %d", a, b, c, d);
        }
    }
}
