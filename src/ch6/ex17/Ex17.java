package ch6.ex17;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");

        int number = scanner.nextInt();

        if (number <=0) {
            System.out.print("Error");
        } else {
            System.out.print("Number is even - " + isEven(number));
        }
    }

    public static boolean isEven (int number){
        boolean result;
        if (number % 2 == 0){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
