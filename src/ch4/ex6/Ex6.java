package ch4.ex6;

public class Ex6 {
    public static void main(String[] args) {
        int sum = 0;
        int x = 1;

        while (x <= 10) {
            sum += x;
            System.out.printf("x = %d%n", x);
            ++x;
        }
        System.out.printf("%nSum is: %d%n", sum);
    }
}
