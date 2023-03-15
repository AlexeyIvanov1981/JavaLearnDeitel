package ch5.ex3c;

public class Ex3c {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 20; i++) {
            System.out.print(i);
            if (i % 5 == 0)
                System.out.println();
            else
                System.out.print('\t');
        }
    }
}

