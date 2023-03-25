package ch6.parkingCharges;

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the parking hours: ");

        double hours = scanner.nextDouble();

        System.out.println("amount to pay for parking: " + calculateCharges(hours) + "$");
    }

    public static double calculateCharges(double hours) {
        double result = 0;
        if (hours <= 3.0) {
            result = 2.0;
        }
        if (hours > 3) {
            result = (hours - 3) * 0.5 + 2;
        }
        return result;
    }
}
