package ch6.ex13;

import java.security.SecureRandom;

public class Ex13 {
    public static void main(String[] args) {
        SecureRandom secureRandomNumbers = new SecureRandom();

        int number1 = 2 + 2 * secureRandomNumbers.nextInt(5);
        System.out.println("2, 4, 6, 8, 10 - " + number1);

        int number2 = 3 + 2 * secureRandomNumbers.nextInt(5);
        System.out.println("3, 5, 7, 9, 11 - " + number2);

        int number3 = 6 + 4 * secureRandomNumbers.nextInt(5);
        System.out.println("6, 10, 14, 18, 22 - " + number3);
    }
}
