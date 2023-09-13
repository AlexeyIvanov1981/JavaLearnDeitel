package ch14.ex;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ender first string: ");
        String firstString = scanner.nextLine();
        int firstStringLength = firstString.length();

        System.out.print("Ender second string: ");
        String secondString = scanner.nextLine();
        int secondStringLength = secondString.length();

        if (firstString.regionMatches(true, 0, secondString, 0, Math.min(firstStringLength, secondStringLength)))
            System.out.printf("first %d charters match", secondStringLength);
        else System.out.printf("first %d charters not match", secondStringLength);
    }
}
