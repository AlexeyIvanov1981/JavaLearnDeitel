package ch8.ex5;

public class Time2ModifyTest {
    public static void main(String[] args) {
        Time2Modify time2Modify = new Time2Modify(86000);

        System.out.println(time2Modify.toUniversalString());
        System.out.println(time2Modify.toString());
    }
}
