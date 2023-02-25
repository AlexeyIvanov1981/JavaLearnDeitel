<<<<<<<< HEAD:src/answers/ch3/ex12/InvoiceTest.java
package answers.ch3.ex12;
========
package ch3.ex12;
>>>>>>>> origin/main:src/ch3/ex12/InvoiceTest.java

import answers.ch3.ex12.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1s", "test", 10, 100.00);
        System.out.print(invoice.getInvoiceAmount());
    }
}
