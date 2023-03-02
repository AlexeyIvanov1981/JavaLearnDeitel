package ch4.ex22;

public class Ex22 {
    public static void main(String[] args) {
        int counter = 1;

        System.out.println("N" + "\t" + "10*N" + "\t" + "100*N" + "\t" + "1000*N\n");

        while (counter <= 5){
            System.out.printf("%d\t%d\t\t%d\t\t%d%n", counter, counter * 10, counter * 100, counter * 1000);
            counter++;
        }
//        while (counter == 10){
//            System.out.printf("%d\t%d\t\t%d\t%d%n", counter, counter * 10, counter * 100, counter * 1000);
//            counter++;
//        }
    }
}
