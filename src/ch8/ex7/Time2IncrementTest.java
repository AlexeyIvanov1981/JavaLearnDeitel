package ch8.ex7;

public class Time2IncrementTest {
    public static void main(String[] args) {
        Time2Increment time = new Time2Increment(11, 59, 59);
        System.out.print(time.toUniversalString());
        System.out.println();

        time.tick();
        System.out.print(time.toUniversalString());
    }
}
