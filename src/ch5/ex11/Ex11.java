package ch5.ex11;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        int counter;
        int minNumber = 2147483647;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество цифр: ");
        counter = input.nextInt();

        for (int i = 1; i <= counter; i++){
            System.out.print("Ведите число: ");
            int number = input.nextInt();
            if (minNumber > number){
                minNumber = number;
            }
        }
        System.out.printf("Минимально число из введенных : %d", minNumber);
    }
}
