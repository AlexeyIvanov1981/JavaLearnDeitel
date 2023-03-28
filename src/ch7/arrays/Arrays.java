package ch7.arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {12, 36, 55, 5465, 564, 321, 54, 324, 0};
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int count = 0; count < array.length; count++){
            System.out.printf("%5d%8d%n", count, array[count]);
        }

    }
}
