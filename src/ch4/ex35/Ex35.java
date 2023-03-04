package ch4.ex35;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size a: ");
        int a = scanner.nextInt();

        System.out.print("Enter size b: ");
        int b = scanner.nextInt();

        System.out.print("Enter size c: ");
        int c = scanner.nextInt();

        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Incorrect size");
        }
    }
}
