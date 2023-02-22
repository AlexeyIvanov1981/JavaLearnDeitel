package src.answ.сh3.ex11;

import answ.сh3.ex11.Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account("John Blue", 12.50);
        Account account2 = new Account("Jane Green", 100.00);

        displayAccount(account1);
        displayAccount(account2);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding deposit amount: $%.2f%n%n", depositAmount);
        account1.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("nadding deposit amount: $%.2f%n%n", depositAmount);
        account2.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);
    }

    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
