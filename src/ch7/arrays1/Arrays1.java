package ch7.arrays1;

public class Arrays1 {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];

        for (int count = 0; count < array.length; count++){
            array[count] = count * 2 + 2;
        }

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int count = 0; count < array.length; count++){
            System.out.printf("%5d%8d%n", count, array[count]);
        }
    }
}
