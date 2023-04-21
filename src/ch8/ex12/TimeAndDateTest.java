package ch8.ex12;

public class TimeAndDateTest {
    public static void main(String[] args) {
        TimeAndDate timeAndDate = new TimeAndDate(12,31,2000,23,59,59);

        System.out.println(timeAndDate.toString());

        System.out.println(timeAndDate.toUniversalString());

        timeAndDate.tick();

        System.out.println(timeAndDate.toString());

        System.out.println(timeAndDate.toUniversalString());
    }
}
