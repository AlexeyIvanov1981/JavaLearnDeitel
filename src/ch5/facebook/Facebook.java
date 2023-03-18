package ch5.facebook;

public class Facebook {
    public static void main(String[] args) {
        int count = 0;
        double userCounter = 1_000_000_000.0;
        double userGrowth = 0.04;

        do {
            ++count;
            userCounter = userCounter + (userCounter*userGrowth);
        }while (userCounter <= 1_500_000_000.0);

        System.out.println("Количество пользователей достигнет 1 500 000 000 через " + count + " месяцев");

        do {
            ++count;
            userCounter = userCounter + (userCounter*userGrowth);
        }while (userCounter <= 2_000_000_000.0);

        System.out.println("Количество пользователей достигнет 2 000 000 000 через " + count + " месяцев");

    }
}
