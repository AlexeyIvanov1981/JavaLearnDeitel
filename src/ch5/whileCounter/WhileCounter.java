package ch5.whileCounter;

public class WhileCounter {
    public static void main(String[] args) {
        int counter = 0;

        while (++counter <=10){
            System.out.printf("%d ", counter );
        }
    }
}
