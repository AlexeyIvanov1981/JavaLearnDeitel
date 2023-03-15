package ch5.ex12;

public class Ex12 {
    public static void main(String[] args) {
        int prod = 1;
        for (int i = 1; i <= 15; i += 2){
            prod *= i;
            System.out.println(prod);
        }
        System.out.printf("Product is: %d", prod);
    }
}
