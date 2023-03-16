package ch5.ex16;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите число от 1 до 30: ");
        number1 = input.nextInt();

        System.out.print("Введите число от 1 до 30: ");
        number2 = input.nextInt();

        System.out.print("Введите число от 1 до 30: ");
        number3 = input.nextInt();

        System.out.print("Введите число от 1 до 30: ");
        number4 = input.nextInt();

        System.out.print("Введите число от 1 до 30: ");
        number5 = input.nextInt();

        for(int i = 1; i <= number1; i++){
            System.out.print("*");
        }
        System.out.println();

        for(int i = 1; i <= number2; i++){
            System.out.print("*");
        }
        System.out.println();

        for(int i = 1; i <= number3; i++){
            System.out.print("*");
        }
        System.out.println();

        for(int i = 1; i <= number4; i++){
            System.out.print("*");
        }
        System.out.println();

        for(int i = 1; i <= number5; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
