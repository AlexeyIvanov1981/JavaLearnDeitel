package ch7.nitArray;

public class InitArray {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Values in array1 by row are");
        arrayPrint(array1);

        System.out.println("Values in array2 by row are");
        arrayPrint(array2);
    }

    public static void arrayPrint(int[][] array) {
        for (int rows = 0; rows < array.length; rows++) {
            for (int columns = 0; columns < array[rows].length; columns++) {
                System.out.printf("%d  ", array[rows][columns]);
            }
            System.out.println();
        }
    }
}
