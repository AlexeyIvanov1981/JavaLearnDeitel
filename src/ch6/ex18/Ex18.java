package ch6.ex18;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side: ");
        int side = scanner.nextInt();

        squareOfAsterisks(side);
    }

    public static void squareOfAsterisks(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
