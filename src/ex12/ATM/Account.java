package ex12.ATM;

public class Account {
    private int accountNumber;
    private int pin;
    private double availableBalance;
    private double totalBalance;

    public Account(int theAccountNumber, int thePin, double theAvailableBalance, double theTotalBalance) {
        accountNumber = theAccountNumber;
        pin = thePin;
        availableBalance = theAvailableBalance;
        totalBalance = theTotalBalance;
    }

    public boolean validatePIN(int userPIN) {
        if (userPIN == pin) {
            return true;
        } else return false;
    }
}
