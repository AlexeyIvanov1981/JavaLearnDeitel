package ch5.globalWarmingFactsQuiz;

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Вопрос №1: .... Ответы: 1 - да, 2 - нет, 3 - может быть, 4 - не уверен: ");
        int userAnsw1 = scanner.nextInt();
        if (userAnsw1 == 1) counter++;

        System.out.print("Вопрос №2: .... Ответы: 1 - да, 2 - нет, 3 - может быть, 4 - не уверен: ");
        int userAnsw2 = scanner.nextInt();
        if (userAnsw2 == 1) counter++;

        System.out.print("Вопрос №3: .... Ответы: 1 - да, 2 - нет, 3 - может быть, 4 - не уверен: ");
        int userAnsw3 = scanner.nextInt();
        if (userAnsw3 == 1) counter++;

        System.out.print("Вопрос №4: .... Ответы: 1 - да, 2 - нет, 3 - может быть, 4 - не уверен: ");
        int userAnsw4 = scanner.nextInt();
        if (userAnsw4 == 1) counter++;

        System.out.print("Вопрос №5: .... Ответы: 1 - да, 2 - нет, 3 - может быть, 4 - не уверен: ");
        int userAnsw5 = scanner.nextInt();
        if (userAnsw5 == 1) counter++;

        switch (counter){
            case 5:
                System.out.println("Very good!!!");
                break;
            case 4:
                System.out.println("Good!");
                break;
            default:
                System.out.println("You need to learn more, see websites: google.com)");
        }
    }
}
