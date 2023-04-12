package ch8.date;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birthDate = new Date(6, 19, 1981);
        Date hireDate = new Date(9, 1, 2020);
        Employee employee = new Employee("Alex", "Ivanov", birthDate, hireDate);
        System.out.println(employee);
    }
}
