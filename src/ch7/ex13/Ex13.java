package ch7.ex13;

import java.util.Arrays;

public class Ex13 {
    public static void main(String[] args) {
        int[][] sales = new int[3][5];
        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                sales[row][col] = col;
            }
        }
        System.out.println(Arrays.deepToString(sales));
    }
}
