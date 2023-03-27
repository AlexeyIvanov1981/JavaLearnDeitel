package ch6.ex20;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.printf("Area of the circle is: %f", circleArea(radius));

    }

    public static double circleArea (double radius){
        return Math.PI * radius;
    }
}
