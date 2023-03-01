package ch4.ex17;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int litr = 0;
        int km = 0;
        double avgAllWays = 0;
        double avgKM = 0;



        int check = 1;


        while (check == 1) {

            System.out.print("Введите количество пройденных километров: ");
            int tmpKM = scanner.nextInt();
            km += tmpKM;

            System.out.print("Введите количество потраченных литров: ");
            int tmpLitr = scanner.nextInt();
            litr += tmpLitr;

            counter++;

            avgKM = (double) (tmpKM) / (tmpLitr);

            System.out.printf("%nКоличество км на 1 литр составило:  %.4f км%n%n", avgKM);

            avgAllWays = (double)  km / litr;
            System.out.printf("Среднее количество километров за %d поездки(у) на 1 литр: %.4f км%n%n", counter, avgAllWays);

            System.out.println("Введите 1 для ввода данных следующей поездки или 2 для завершения программы: ");
            check = scanner.nextInt();
        }
        System.out.printf("Итог расхода топлива и количества пройденных км:" +
                "%nВсего пройдено км - %d%n" +
                "Всего потрачено литров бензина - %d%n" +
                "На 1 литре бензина вы проехали - %.4f%n", km, litr, avgKM);
    }
}
