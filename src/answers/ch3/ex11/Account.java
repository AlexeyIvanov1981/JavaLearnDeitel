<<<<<<<< HEAD:src/answers/ch3/ex11/Account.java
package answers.ch3.ex11;
========
package ch3.ex11;
>>>>>>>> origin/main:src/ch3/ex11/Account.java

public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) this.balance = balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
    }
    public void withdrawal(double withdravalAmount){
        if (balance - withdravalAmount >= 0)
            balance -= withdravalAmount;
        else  {
            System.out.printf("You cannot Withdraw %.2f%n", withdravalAmount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
