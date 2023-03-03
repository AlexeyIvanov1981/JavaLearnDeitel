package ch4.ex29;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size: ");
        int size = scanner.nextInt();
        char a = '*';

        for (int i = 0; i < size; i++) {
            System.out.printf("%c ", a);
        }

        for (int i = 0; i < size - 2; i++) {
            System.out.printf("%n%c", a);
            for (int j = 0; j < size; j++){
                System.out.print("  ");
            }
            System.out.printf("%c", a);
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.printf("%c ", a);
        }
    }
}

