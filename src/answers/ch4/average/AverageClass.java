package answers.ch4.average;

import java.util.Scanner;

public class AverageClass {
    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        while (counter <= 10) {
            System.out.println("Enter student grade: ");
            sum = sum + scanner.nextInt();
            counter = counter + 1;
        }

        int average = sum / counter;

        System.out.printf("%nTotal grade sum is: %d%n", sum);
        System.out.printf("%nAverage grade is: %d%n", average);
    }
}
