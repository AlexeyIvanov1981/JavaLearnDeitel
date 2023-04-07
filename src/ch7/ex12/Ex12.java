package ch7.ex12;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        int[] userValue = new int[6];
        Scanner scanner = new Scanner(System.in);

//        for (int i = 1; i < userValue.length; i++) {
//            System.out.printf("Enter %dth number from 10 to 100: ", i + 1);
//            userValue[i] = scanner.nextInt();
//            System.out.println("Value in array: " + Arrays.toString(userValue));
//            if (userValue[i] != userValue[i - 1]) {
//                System.out.printf("You entered %d%n", userValue[i]);
//            }
        for (int i = 1; i < userValue.length; i++) {
            System.out.printf("Enter %dth number from 10 to 100: ", i);
            userValue[i] = scanner.nextInt();
            System.out.println("Value in array: " + Arrays.toString(userValue));
            for (int j = 0; j < userValue.length; j++) {
                if (userValue[i] != userValue[j] && userValue[j] > 0){
                    System.out.println("You entered " + userValue[i]);
                }
            }

    }
    }
}
