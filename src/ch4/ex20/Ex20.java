package ch4.ex20;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите часы для сотрудника 1: ");
        double employeeHours1 = scanner.nextInt();

        System.out.print("Введите часы для сотрудника 2: ");
        double employeeHours2 = scanner.nextInt();

        System.out.print("Введите часы для сотрудника 3: ");
        double employeeHours3 = scanner.nextInt();

        System.out.print("Введите ставку для сотрудника1 : ");
        double employeeTax1 = scanner.nextInt();

        System.out.print("Введите ставку для сотрудника2 : ");
        double employeeTax2 = scanner.nextInt();

        System.out.print("Введите ставку для сотрудника3 : ");
        double employeeTax3 = scanner.nextInt();

        double salaryEmployee1;
        double salaryEmployee2;
        double salaryEmployee3;

        if(employeeHours1 > 40) {
            double tmp = employeeHours1 - 40;
            double allHours = (tmp * 1.5) + 40;
            salaryEmployee1 = allHours * employeeTax1;
        } else {
            salaryEmployee1 = employeeHours1 * employeeTax1;
        }

        if(employeeHours2 > 40) {
            double tmp = employeeHours2 - 40;
            double allHours = (tmp * 1.5) + 40;
            salaryEmployee2 = allHours * employeeTax2;
        } else {
            salaryEmployee2 = employeeHours2 * employeeTax2;
        }

        if(employeeHours3 > 40) {
            double tmp = employeeHours3 - 40;
            double allHours = (tmp * 1.5) + 40;
            salaryEmployee3 = allHours * employeeTax3;
        } else {
            salaryEmployee3 = employeeHours3 * employeeTax3;
        }

        System.out.println("salaryEmployee1 = " + salaryEmployee1);
        System.out.println("salaryEmployee2 = " + salaryEmployee2);
        System.out.println("salaryEmployee3 = " + salaryEmployee3);
    }
}
