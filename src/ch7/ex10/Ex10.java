package ch7.ex10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {

    public static int calculateZP(int cash) {
        int totalZp = (cash * 9 / 100) + 200;
        return totalZp;
    }


    public static void main(String[] args) {

        ArrayList<Integer> zp = new ArrayList<>();
        int[] forDiagram = new int[11];


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите прибыль от 3х работников через пробел: ");
        int zpWorker1 = calculateZP(scanner.nextInt());
        int zpWorker2 = calculateZP(scanner.nextInt());
        int zpWorker3 = calculateZP(scanner.nextInt());

        System.out.println(zpWorker1);
        System.out.println(zpWorker2);
        System.out.println(zpWorker3);

        forDiagram[zpWorker1 / 100] += 1;
        forDiagram[zpWorker2 / 100] += 1;
        forDiagram[zpWorker3 / 100] += 1;

        System.out.println(Arrays.toString(forDiagram));

        for (int i = 0; i < forDiagram.length; i++) {
            if (i == 10)
                System.out.printf("%7d: ", 1000);
            else
                System.out.printf("%02d-%02d: ",
                        i * 100, i * 100 + 99);
            for (int stars = 0; stars < forDiagram[i]; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

