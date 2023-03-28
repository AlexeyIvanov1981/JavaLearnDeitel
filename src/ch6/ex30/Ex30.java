package ch6.ex30;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number from 1 to 1000 or enter -1 if you can end game: ");
        int userNumber = scanner.nextInt();
        int randomNumber = secureRandom.nextInt(1001);
        int tmpNumber = 0;

        do {
            System.out.println(randomNumber);
            tmpNumber = isTrue(userNumber,randomNumber);
            if (tmpNumber != 1) {
                System.out.print("Try again: ");
                userNumber = scanner.nextInt();
            } else break;
        }
        while (tmpNumber != 1);

    }
    static int isTrue (int userNumber, int randomNumber) {
        int result = 0;
        if (userNumber == randomNumber) {
            System.out.println("You won!");
            result = 1;
        }
        if (userNumber < randomNumber) {
            System.out.println("Your number is smaller");
            result = 2;
        }
        if (userNumber > randomNumber) {
            System.out.println("Your number is bigger");
            result = 3;
        }
        return result;
    }
}
