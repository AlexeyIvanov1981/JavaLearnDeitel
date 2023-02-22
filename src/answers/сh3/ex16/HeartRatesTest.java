package answers.сh3.ex16;

import answ.сh3.ex16.HeartRates;

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter user surname: ");
        String userSurname = scanner.nextLine();
        System.out.print("Enter user day of birth: ");
        int userDayOfBirth = scanner.nextInt();
        System.out.print("Enter user month of birth: ");
        int userMonthOfBirth = scanner.nextInt();
        System.out.print("Enter user year of birth: ");
        int userYearOfBirth = scanner.nextInt();

        HeartRates heartRates1 = new HeartRates(userName, userSurname, userDayOfBirth, userMonthOfBirth, userYearOfBirth);

        System.out.print(heartRates1);

    }
}
