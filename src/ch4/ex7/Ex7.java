package ch4.ex7;

public class Ex7 {
    public static void main(String[] args) {
        int product = 5;
        int x = 5;

        product *= x++;

        System.out.print(product + " " + x);

    }
}
