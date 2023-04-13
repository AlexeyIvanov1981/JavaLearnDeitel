package ch8.employee;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.printf("Count before create a new Employee object - %d%n", Employee.getCount());

        Employee employee1 = new Employee("Bob", "BOB");
        Employee employee2 = new Employee("Rob", "ROB");
        Employee employee3 = new Employee("Tod", "TOD");
        Employee employee4 = new Employee("Mak", "MAK");

        System.out.printf("Count after create a new Employee object - %d%n", Employee.getCount());

        System.out.printf("employee1 - %s %s%nemployee2 - %s %s%nemployee3 - %s %s%nemployee4 - %s %s%n",
                employee1.getFirstName(), employee1.getLastName(),
                employee2.getFirstName(), employee2.getLastName(),
                employee3.getFirstName(), employee3.getLastName(),
                employee4.getFirstName(), employee4.getLastName());
    }
}
