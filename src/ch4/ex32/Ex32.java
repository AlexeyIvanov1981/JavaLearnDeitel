package ch4.ex32;

public class Ex32 {
    public static void main(String[] args) {
        int counter = 1;

        while (counter <= 4) {


            for (int i = 1; i <= 8; i++) {
                System.out.print("* ");
                System.out.print(" ");

            }
            System.out.println();

            for (int i = 1; i <= 8; i++) {
                System.out.print(" *");
                System.out.print(" ");

            }
            System.out.println();
            counter++;
        }
    }
}
