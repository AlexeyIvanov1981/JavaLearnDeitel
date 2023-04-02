package ch7.enhancedForTest;

public class EnhancedForTest {
    public static void main(String[] args) {
        int total = 0;
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };


        for (int number : array) {
            total += number;
        }
        System.out.printf("total is %d", total);
    }
}
