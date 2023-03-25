package ch6.ex19;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side: ");
        int side = scanner.nextInt();
        System.out.print("Enter char: ");
        char letter = scanner.next().charAt(0);

        squareOfAsterisks(side, letter);
    }

    public static void squareOfAsterisks(int side, char letter) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.printf("%c  ", letter);
            }
            System.out.println();
        }
    }
}
