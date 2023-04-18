package ch8.ex10;

public class TrafficColorTest {
    public static void main(String[] args) {
        System.out.printf("%7s - time for: %d second%n", TrafficColor.RED, TrafficColor.RED.getSecond());
        System.out.printf("%7s - time for: %d second%n", TrafficColor.YELLOW, TrafficColor.YELLOW.getSecond());
        System.out.printf("%7s - time for: %d second%n", TrafficColor.GREEN, TrafficColor.GREEN.getSecond());
    }
}
