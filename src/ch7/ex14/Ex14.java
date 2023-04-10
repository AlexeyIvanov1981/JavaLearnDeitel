package ch7.ex14;

public class Ex14 {
    public static void main(String[] args) {
        System.out.println(calculate(1, 2));
        System.out.println(calculate(1, 2, 3));
        System.out.println(calculate(1, 2, 3, 4));
    }

    public static int calculate(int ... value){
        int total = value[0];
        for (int i = 1; i < value.length; i++) {
            total *= value[i];
        }
        return total;
    }
}
