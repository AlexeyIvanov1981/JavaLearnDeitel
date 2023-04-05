package ch7.ex9;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int[][] t = new int[2][3];
//        t[0] = new int[]{1, 2};
//        System.out.println(Arrays.toString(t[0]));
//        t[1] = new int[]{3, 4};
//        t[0][1] = 0;
//        System.out.println(t[0][1]);
//        t[0][0] = 0;
//        t[0][1] = 0;
//        t[0][2] = 0;
//        t[1][0] = 0;
//        t[1][1] = 0;
//        t[1][3] = 0;
//
//        for (int i = 0; i < t.length; i++) {
//            for (int j = 0; j < t[i].length; j++) {
//                t[i][j] = 0;
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
//                System.out.printf("Enter value for array t[%d][%d]: ", i, j);
                t[i][j] = secureRandom.nextInt(100);
            }
        }
        System.out.println(Arrays.deepToString(t));

        int min = 1000000;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (t[i][j] < min)
                    min = t[i][j];
            }
        }
        System.out.println(min);


        System.out.printf("t[%d], t[%d]%n", t[0][0], t[0][1]);

        int sum = t[0][2] + t[1][2];
        System.out.println(sum);

        System.out.printf("%19s%12s%12s%n", "Column1", "Column2", "Column3");

        for (int i = 0; i < t.length; i++) {
            if (i == 1) System.out.println();
            System.out.printf("Row %d", i + 1);

            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("\t\t\t%3d", t[i][j]);

            }
        }
    }
}
