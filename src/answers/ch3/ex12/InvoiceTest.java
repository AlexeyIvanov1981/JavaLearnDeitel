package answers.ch3.ex12;

import answers.ch3.ex12.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1s", "test", 10, 100.00);
        System.out.print(invoice.getInvoiceAmount());
    }
}