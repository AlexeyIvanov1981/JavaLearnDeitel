package ch7.arrays3;

import java.security.SecureRandom;
import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] counter = new int[7];

        for (int i = 1; i <= 6_000_000; i++) {
            ++counter[(1 + random.nextInt(6))];
        }

        System.out.printf("%s%9s%n", "Num", "Value");

        for (int i = 1; i < counter.length; i++) {
            System.out.printf("%3d%9d%n", i, counter[i]);
        }

        System.out.print(Arrays.toString(counter));
    }
}
