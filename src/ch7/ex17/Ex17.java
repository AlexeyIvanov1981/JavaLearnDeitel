package ch7.ex17;

import java.security.SecureRandom;
import java.util.Arrays;

public class Ex17 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int[] result = new int[13];

        for (int i = 1; i <= 36_000_000; i++) {
            int firstDice = secureRandom.nextInt(1, 7);
            int secondDice = secureRandom.nextInt(1, 7);
            int sum = firstDice + secondDice;
            result[sum] += 1;
        }

        for (int i = 2; i < result.length; i++) {
            System.out.printf("%d выпало %d раз(а)%n", i, result[i]);
        }
    }
}
