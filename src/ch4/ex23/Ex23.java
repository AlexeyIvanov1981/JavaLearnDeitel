package ch4.ex23;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largestNumber1 = 0;
        int largestNumber2 = 0;
        int counter = 1;

        while (counter <= 10) {
            System.out.print("Enter number: ");
            int tmpNumber = scanner.nextInt();

            if (tmpNumber > largestNumber1) {
                largestNumber1 = tmpNumber;
            }
            if (tmpNumber < largestNumber1 && tmpNumber > largestNumber2) {
                largestNumber2 = tmpNumber;
            }
            counter++;

            System.out.println("largestNumber1 = " + largestNumber1);
            System.out.println("largestNumber2 = " + largestNumber2);
        }
    }
}

