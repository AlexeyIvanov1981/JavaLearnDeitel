package ex12.ATM;

public class BankDatabase {
    private Account[] accounts;

    public BankDatabase(){
        accounts = new Account[2];
        accounts[0] = new Account(12345, 54321, 1000.0, 1200.0);
        accounts[1] = new Account(98765, 56789, 200.0, 200.0);
    }
}
