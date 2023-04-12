package ch7.ex20;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        int[][] totalSales = new int[4][5];
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        while (counter < 4) {
            System.out.print("Введите номер продавца, номер продукта и общую стоимость через пробел: ");
            int salesNumber = scanner.nextInt() - 1;
            int productNumber = scanner.nextInt() - 1;
            int totalSum = scanner.nextInt();

            totalSales[salesNumber][productNumber] = totalSum;
            ++counter;
        }

        for (int row = 0; row < totalSales.length; row++) {
            System.out.printf("Worker %d - ", row + 1);
            for (int column = 0; column < totalSales[row].length; column++) {
                System.out.printf("  product %d = %d;", column + 1, totalSales[row][column]);
            }
            System.out.println();
        }
    }
}
