package ch4.analysis;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int passed = 0;
        int failed = 0;
        int studentCounter = 1;


        while (studentCounter <= 10) {
            System.out.print("Enter 1 if passed or enter 2 if failed: ");
            int tmpAnswer = scanner.nextInt();

            if (tmpAnswer == 1) {
                passed += 1;
            } else {
                failed += 1;
            }
            studentCounter += 1;
        }

        System.out.printf("%nPassed is: %d %nFailed is: %d%n", passed, failed);

        if (passed > 8) {
            System.out.println("Bonus to instructor!");
        }
    }
}
