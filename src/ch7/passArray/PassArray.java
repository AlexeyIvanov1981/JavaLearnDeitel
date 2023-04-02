package ch7.passArray;

public class PassArray {
    public static void main(String[] args) {
        int[]array = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < array.length; i++) {
            System.out.printf("  %d", array[i]);
        }

        modifyArray(array);
        System.out.printf("%n%nModify array:%n");
        for (int a : array){
            System.out.printf("  %d", a);
        }
        System.out.println();


        modifyElement(array[3]);
    }

    static void modifyArray(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            array2[i] *= 2;
        }
    }

    static void modifyElement(int element) {
        element *= 2;
        System.out.printf("Value of element in modifyElement: %d%n", element);
    }
}
