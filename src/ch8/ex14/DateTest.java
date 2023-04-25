package ch8.ex14;

public class DateTest {
    public static void main(String[] args) {

        Date date = new Date("JUL", 1, 2000);
        System.out.println(date.toStringForMonthString());

        Date date1 = new Date(1, 1, 2000);
        System.out.println(date1.toStringStandart());

        Date date2 = new Date(360, 2000);
        System.out.println(date2.toStringForDayNumber());
    }
}
