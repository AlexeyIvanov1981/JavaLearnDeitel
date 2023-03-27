package ch6.ex22;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temp and 'c' or 'f' with space (for example - 12 C): ");

        int temp = scanner.nextInt();
        char ch = scanner.next().charAt(0);

        switch (ch) {
            case 'c':
                System.out.println(fahrenheit(temp));
                break;
            case 'f':
                System.out.println(celsius(temp));
                break;
        }

    }

    static int celsius(int fahrenheit) {
        return (int) ((int) 5.0 / 9.0 * (fahrenheit - 32));
    }

    static int fahrenheit(int celsius) {
        return (int) ((int) 9.0 / 5.0 * celsius + 32);
    }

}
