package ch4.ex30;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 5 numbers: ");

        int userNumber = scanner.nextInt();

        int a = userNumber / 10000;
        int b = userNumber / 1000 % 10;
        int c = userNumber / 100 % 10;
        int d = userNumber / 10 % 10;
        int f = userNumber % 10;

        if((userNumber / 100000) > 0 || (userNumber / 10000) == 0) {
            System.out.println("You input incorrect number!");
        }
        else if (a == f && b == d) {
            System.out.print("That number is Palindromes");
        }
        else {
            System.out.print("That number isn't Palindromes");
        }
    }

}
