package ch6.rollDie;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;

        for (int i = 1; i <= 6_000_000; i++) {
            int face = random.nextInt(6) + 1;
            switch (face) {
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;
            }
        }
        System.out.println("Face\tFrequency");
        System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t%d%n4\t\t%d%n5\t\t%d%n6\t\t%d%n",
                frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);
    }
}
