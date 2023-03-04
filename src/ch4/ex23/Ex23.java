package ch4.ex23;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largestNumber1 = -2147483648;
        int largestNumber2 = -2147483648;
        int counter = 1;
        int tmpNumber = -2147483648;

        System.out.print("Enter number: ");
        tmpNumber = scanner.nextInt();
        largestNumber1 = tmpNumber;

        while (counter <= 9) {
            System.out.print("Enter number: ");
            tmpNumber = scanner.nextInt();
            if (tmpNumber > largestNumber1) {
                largestNumber2 = largestNumber1;
                largestNumber1 = tmpNumber;
            }
            if (tmpNumber < largestNumber1 && tmpNumber > largestNumber2){
                largestNumber2 = tmpNumber;
            }

            counter++;

            System.out.println("largestNumber1 = " + largestNumber1);
            System.out.println("largestNumber2 = " + largestNumber2);
        }
    }
}

