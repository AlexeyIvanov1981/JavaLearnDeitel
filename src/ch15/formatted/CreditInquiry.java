package ch15.formatted;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry {
    private final static MenuOption[] choices = MenuOption.values();

    public static void main(String[] args) {
        MenuOption accountType = getRequest();
    }

    private static MenuOption getRequest() {
        int request = 4;
        System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
                " 1 - List accounts with zero balances",
                " 2 - List accounts with credit balances",
                " 3 - List accounts with debit balances",
                " 4 - Terminate program");

        try {
            Scanner input = new Scanner(System.in);
            do {
                System.out.printf("%n? ");
                request = input.nextInt();
            } while ((request < 1) || (request > 4));
        } catch (NoSuchElementException elementException){
            System.err.println("Invalid input. Terminating.");
        }
        return choices[request - 1];
    }
}
