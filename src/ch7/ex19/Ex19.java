package ch7.ex19;

import java.util.Scanner;

public class Ex19 {
    //    int[][] places = new int[2][5];
    static boolean[] businessEconomy = new boolean[10];
    static int count = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        choosePlace();
        while (count <= 10) {
            choosePlace();
        }
    }


    public static void choosePlace() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%nBusiness class has places:%n");
        for (int i = 0; i < businessEconomy.length - 5; i++) {
            count++;
            System.out.printf("Place #%d - %s %n", i + 1, businessEconomy[i] ? "can not choose" : "can choose");
        }

        System.out.printf("%nEconomy class has places:%n");
        for (int i = 5; i < businessEconomy.length; i++) {
            count++;
            System.out.printf("Place #%d - %s %n", i + 1, businessEconomy[i] ? "can not choose;" : "can choose;");
        }

        System.out.print("Enter your choose (1 - business, 2 - economy): ");

        int userChoose = scanner.nextInt();
        choosePlace(userChoose);

    }


    public static void choosePlace(int userChoose) {
        if (userChoose == 1) {
            for (int i = 0; i < businessEconomy.length - 5; i++) {
                if (businessEconomy[i] == false) {
                    businessEconomy[i] = true;
                    System.out.printf("Your place is %d in business class%n", i + 1);
                    break;
                }
//                System.out.println("Sorry, you can't choose business class, but you can choose economy class");

            }
        }
        if (userChoose == 2) {
            for (int i = 5; i < businessEconomy.length; i++) {
                if (businessEconomy[i] == false) {
                    businessEconomy[i] = true;
                    System.out.printf("Your place is %d in economy class%n", i + 1);
                    break;
                }
//                System.out.println("Sorry, you can't choose economy class, but you can choose business class");
            }
        }
    }
}
