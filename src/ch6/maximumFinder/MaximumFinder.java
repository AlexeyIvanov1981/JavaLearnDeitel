package ch6.maximumFinder;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input 3 numbers separated by spaces: ");

        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        double result = MaximumFinder.maxFinder(x, y, z);

        System.out.println("Maximum is " + result);
    }



    public static double maxFinder(double x, double y, double z){

        return Math.max(x, Math.max(y, z));
    }
}
