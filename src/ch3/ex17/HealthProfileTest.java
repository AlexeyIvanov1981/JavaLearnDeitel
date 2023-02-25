package ch3.ex17;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter user surname: ");
        String userSurname = scanner.nextLine();

        System.out.print("Enter user sex (M/F): ");
        String userSex = scanner.nextLine();

        System.out.print("Enter user day of birth: ");
        int userDayOfBirth = scanner.nextInt();

        System.out.print("Enter user month of birth: ");
        int userMonthOfBirth = scanner.nextInt();

        System.out.print("Enter user year of birth: ");
        int userYearOfBirth = scanner.nextInt();

        System.out.print("Enter user height: ");
        double userHeight = scanner.nextDouble();

        System.out.print("Enter user weight: ");
        int userWeight = scanner.nextInt();

        HealthProfile healthProfile = new HealthProfile(userName, userSurname, userSex, userDayOfBirth,
                                                        userMonthOfBirth, userYearOfBirth, userHeight, userWeight);

        System.out.println(healthProfile);
    }
}
