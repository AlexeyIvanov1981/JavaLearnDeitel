package ch8.ex7;

public class Time2IncrementTest {
    public static void main(String[] args) {
        Time2Increment time = new Time2Increment(11, 58, 59);
        System.out.printf("time before increment: %s%n", time.toUniversalString());
        System.out.println();

        time.tick();
        System.out.printf("Time after increment: %s%n", time.toUniversalString());
    }
}
