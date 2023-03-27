package ch6.ex23;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 3 numbers between space: ");

        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        System.out.printf("Minimum from 3 numbers: %f", minimum3(number1, number2, number3));
    }
    static double minimum3(double number1, double number2, double number3) {
        return Math.min(number1, (Math.min(number2, number3)));
    }
}
