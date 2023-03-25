package ch6.sphere;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input radius: ");
        double radius = scanner.nextDouble();

        System.out.printf("radius is - %f", sphereVolume(radius));
    }

    public static double sphereVolume(double radius){

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        return volume;
    }
}
