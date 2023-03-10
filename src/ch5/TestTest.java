package ch5;

import java.util.Scanner;

public class TestTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number from 1 to 3: ");

        while (scanner.hasNext()){

            int userInput = scanner.nextInt();
            switch (userInput){
                case 1:
                    System.out.println("One");
                    System.out.print("Input number from 1 to 3: ");
                    break;
                case 2:
                    System.out.println("Two");
                    System.out.print("Input number from 1 to 3: ");
                    break;
                case 3:
                    System.out.println("Three");
                    System.out.print("Input number from 1 to 3: ");
                    break;
            }
        }

    }
}
