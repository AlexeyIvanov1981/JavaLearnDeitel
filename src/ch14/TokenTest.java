package ch14;

import java.util.Scanner;

public class TokenTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your words");

        String words = scanner.nextLine();

        String[] wordsArray = words.split(" ");
        System.out.printf("Number of elements: %d%nThe tokens are:%n", wordsArray.length);

        for (String string : wordsArray)
            System.out.println(string);
    }
}
