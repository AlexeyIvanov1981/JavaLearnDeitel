package ch14.ex;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ender first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Ender second string: ");
        String secondString = scanner.nextLine();

        if (firstString.compareTo(secondString) > 0) System.out.printf("first string more that second string (%d)%n",
                firstString.compareTo(secondString));
        if (firstString.compareTo(secondString) == 0) System.out.printf("first string == second string (%d)%n",
                firstString.compareTo(secondString));
        if (firstString.compareTo(secondString) < 0) System.out.printf("second string more that first string (%d)%n",
                firstString.compareTo(secondString));
    }
}
