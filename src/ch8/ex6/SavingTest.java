package ch8.ex6;

public class SavingTest {
    public static void main(String[] args) {
        SavingsAccount save1 = new SavingsAccount("Save1",2000.0);
        SavingsAccount save2 = new SavingsAccount("Save2",3000.0);

        save1.print();
        save2.print();


        SavingsAccount.modifyInterestRate(5);
        System.out.println("After change rate");

        save1.print();
        save2.print();
    }
}
