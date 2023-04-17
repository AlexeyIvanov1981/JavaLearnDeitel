package ch8.ex6;

public class SavingsAccount {
    private static double annualInterestRate = 4.0;
    private double savingsBalance;
    private String name;

    public SavingsAccount(String name, double savingsBalance) {
        this.savingsBalance = savingsBalance;
        this.name = name;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public String getName() {
        return name;
    }

    public double calculateMonthlyInterest() {
        double result = savingsBalance * annualInterestRate / 12;
        savingsBalance += result;
        return result;
    }

    public static void modifyInterestRate(double annualInterestRate) {

        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public void print(){
        System.out.printf("%s%n", getName());
        for (int i = 1; i <= 12; i++) {
            double tmp = calculateMonthlyInterest();
            System.out.printf("%4d month - %10.2f;   Total balance: %10.2f%n", i, tmp, savingsBalance);
        }
    }
}
