package ch4.ex19;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int ZP = 200;
        int productCounter = 0;

        while (true){
            System.out.print("Enter the price of the sold item: ");
            int tmpPrice = scanner.nextInt();
            productCounter += tmpPrice;

            int bonus = (productCounter * 9 / 100);

            System.out.println("Your bonus is " + bonus);

            int salary = ZP + bonus;

            System.out.printf("Your salary at the moment is: %d%n", salary);
        }
    }
}
