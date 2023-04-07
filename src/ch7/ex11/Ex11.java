package ch7.ex11;

import java.util.Arrays;

public class Ex11 {
    public static void main(String[] args) {
        int[] counts = new int[10];
//        for (int i = 0; i < counts.length; i++) {
//            counts[i] = 0;
//        }
        System.out.println(Arrays.toString(counts));

        int[] bonus = new int[15];
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] += 1;
        }
        System.out.println(Arrays.toString(bonus));

        int[] bestScore = new int[5];
        for (int i = 0; i < bestScore.length; i++) {
            System.out.printf("%d %n", bestScore[i]);
        }
    }
}
