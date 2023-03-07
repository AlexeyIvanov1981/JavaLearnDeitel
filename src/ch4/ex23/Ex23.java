package ch4.ex23;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largestNumber1 = -2147483648;
        int largestNumber2 = -2147483648;
        int counter = 1;
        int userInput = -2147483648;

        System.out.print("Enter number: ");
        userInput = scanner.nextInt();
        largestNumber1 = userInput;

        while (counter <= 9) {
            System.out.print("Enter number: ");
            userInput = scanner.nextInt();
            if (userInput > largestNumber1) {
                largestNumber2 = largestNumber1;
                largestNumber1 = userInput;
            }
            if (userInput < largestNumber1 && userInput > largestNumber2){
                largestNumber2 = userInput;
            }

            counter++;

            System.out.println("largestNumber1 = " + largestNumber1);
            System.out.println("largestNumber2 = " + largestNumber2);
        }
    }
}

