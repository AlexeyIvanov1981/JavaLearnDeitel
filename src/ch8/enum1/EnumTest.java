package ch8.enum1;

import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("All books:");

        for (Book book : Book.values()){
            System.out.printf("%-10s %-45s%s%n",book, book.getTitle(), book.getCopyrightYear());
        }
        for (Book book : EnumSet.range(Book.CPPHTP, Book.CSHARPHTP)){
            System.out.printf("%-10s %-45s%s%n",book, book.getTitle(), book.getCopyrightYear());
        }
    }
}
