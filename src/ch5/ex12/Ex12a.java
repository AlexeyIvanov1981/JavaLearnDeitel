package ch5.ex12;

public class Ex12a {
    public static void main(String[] args) {
        int counter = 15;
        int prod = 1;
        do {
            prod = prod * counter;
            counter -= 2;
        }
        while (counter >= 1);
        System.out.println(prod);
    }

}
