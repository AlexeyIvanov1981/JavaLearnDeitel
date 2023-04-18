package ch8.ex8;

public class DateIncrementTest {
    public static void main(String[] args) {
        DateIncrement dateIncrement = new DateIncrement(11, 30, 2000);
        dateIncrement.nextDay();
        System.out.printf("after increment to month: %s%n", dateIncrement.toString());

        System.out.println();

        DateIncrement dateIncrement2 = new DateIncrement(12, 31, 2000);
        dateIncrement2.nextDay();
        System.out.printf("after increment to year: %s%n", dateIncrement2.toString());
    }
}
