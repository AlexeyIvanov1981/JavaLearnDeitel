package ch10.someDoing;

import java.util.Scanner;

public class Revert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");

        String string = scanner.nextLine();
        char[] ch = string.toCharArray();

        for (int i = ch.length - 1; i >= 0 ; i--){
            System.out.print(ch[i]);
        }
    }
}
