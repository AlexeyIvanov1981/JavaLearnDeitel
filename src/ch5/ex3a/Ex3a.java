package ch5.ex3a;

public class Ex3a {
    public static void main(String[] args) {
        int count;
        int sum = 0;

        for (count = 1; count <= 99; count += 2) {
            sum += count;
            System.out.println("Sum - " + sum);
        }

        System.out.println("Total Sum is: " + sum);
    }
}
