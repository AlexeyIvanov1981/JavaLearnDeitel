package ch7.ex19;

import java.util.Scanner;

public class Ex19 {
    static boolean[] businessEconomy = new boolean[10];
    static int counter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        choosePlace();
        while (counter <= 10) {
            choosePlace();
        }
        System.out.println("Next flight leaves in 3 hours.");
    }


    public static void choosePlace() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%nBusiness class has places:%n");
        for (int i = 0; i < businessEconomy.length - 5; i++) {
            System.out.printf("Place #%d - %s %n", i + 1, businessEconomy[i] ? "can not choose" : "can choose");
        }

        System.out.printf("%nEconomy class has places:%n");
        for (int i = 5; i < businessEconomy.length; i++) {
            System.out.printf("Place #%d - %s %n", i + 1, businessEconomy[i] ? "can not choose;" : "can choose;");
        }

        System.out.print("Choose class (1 - business, 2 - economy): ");

        int userChoose = scanner.nextInt();
        addPlace(userChoose);

    }


    public static void addPlace(int userChoose) {
        if (userChoose == 1) {
            for (int i = 0; i < businessEconomy.length - 5; i++) {
                if (!businessEconomy[i]) {
                    businessEconomy[i] = true;
                    System.out.printf("%nYour place is %d in business class%n", i + 1);
                    counter++;
                    break;
                }
            }
            if (businessEconomy[4]) {
                System.out.println("Sorry, you can't choose business class, but you can choose economy class");
            }
            System.out.println(" count - " + counter);
        }


        if (userChoose == 2) {
            for (int i = 5; i < businessEconomy.length; i++) {
                if (!businessEconomy[i]) {
                    businessEconomy[i] = true;
                    counter++;
                    System.out.printf("%nYour place is %d in economy class%n", i + 1);
                    break;
                }
            }
            if (businessEconomy[9]) {
                System.out.println("Sorry, you can't choose economy class, but you can choose business class");
            }
            System.out.println(" count - " + counter);

        }
    }
}
