package ch7.ex3;

public class Ex3 {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 10;
        double[] array = new double[ARRAY_SIZE];
        double value = array[3];
        array[9] = 1.667;
        array[5] = 3.333;
        System.out.println(value);
        double total = 0;
        for (int x = 0; x < array.length; x++) {
            total += array[x];
        }
    }
}
