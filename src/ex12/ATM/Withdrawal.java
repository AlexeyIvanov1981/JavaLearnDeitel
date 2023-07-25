package ex12.ATM;

import java.security.PrivateKey;

public class Withdrawal extends Transaction {

    private double amount;
    private Keypad keypad;
    private CashDispenser cashDispenser;

    public Withdrawal() {

    }

    @Override
    public void execute(){

    }

    public double getAmount() {
        return amount;
    }

    public Keypad getKeypad() {
        return keypad;
    }

    public CashDispenser getCashDispenser() {
        return cashDispenser;
    }
}
