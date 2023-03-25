package ch6.ex9;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number what you want to round: ");
        double number = scanner.nextDouble();

        System.out.printf("Your number - %.3f, round number - %.3f", number, calculate(number));
    }

    public static double calculate(double number) {
        return Math.floor(number + 0.5);
    }
}
