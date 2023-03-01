package ch4.ex21;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int largestNumber = 0;
        int lastNumber = 0;

        while (counter <= 10) {
            System.out.println("Enter number: ");
            lastNumber = scanner.nextInt();
            if (lastNumber > largestNumber) {
                largestNumber = lastNumber;
            }
            counter++;
        }
        System.out.println("last Number = " + lastNumber);
        System.out.println("largest Number = " + largestNumber);
    }
}
