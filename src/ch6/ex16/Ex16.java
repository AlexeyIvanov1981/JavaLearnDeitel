package ch6.ex16;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two values separated by spaces: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.print("second value in each pair is a multiple of the first - " + isMultiple(number1, number2));
    }

    public static boolean isMultiple (int number1, int number2) {
        boolean result;
        if (number2 % number1 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
