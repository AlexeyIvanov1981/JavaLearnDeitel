package ch5.ex14;

public class Ex14 {
    public static void main(String[] args) {
        double amount;
        double principal = 1000.0;
        double rate = 0.05;

        for (int i = 5; i <= 10; i++){
            System.out.printf("%s%20s%10s%n", "Year", "Amount on deposit", "Rate");

            for (int year = 1; year <= 10; ++year){
                amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,20.2f%,10.2f%n", year, amount, rate);
            }
            System.out.println();
            rate = rate + 0.01;
        }
    }
}
