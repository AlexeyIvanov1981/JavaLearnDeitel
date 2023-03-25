package ch6.ex10;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number what you want to round: ");
        double number = scanner.nextDouble();

        System.out.printf("Your number - %f%n" +
                        "Round To Integer - %f%n" +
                        "Round To Tenths - %f%n" +
                        "Round To Hundredths - %f%n" +
                        "Round To Thousandths - %f",
                        number,
                        roundToInteger(number),
                        roundToTenths(number),
                        roundToHundredths(number),
                        roundToThousandths(number));
    }

    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}
