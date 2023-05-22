package ch10.interfases;


public class PayableInterfaceTest {

    public static void main(String[] args) {


        Payable[] payableObject = new Payable[4];

        payableObject[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObject[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObject[2] = new SalariedEmployeeInt("John", "Smith",
                "111-11-1111", 800.00);
        payableObject[3] = new SalariedEmployeeInt("Lisa", "Barnes", 
                "888-88-8888", 1200.00);

        for (Payable currentPayable : payableObject) {
            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "payment due",
                    currentPayable.getPaymentAmount());
        }
    }
}
