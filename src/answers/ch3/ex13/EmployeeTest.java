<<<<<<<< HEAD:src/answers/ch3/ex13/EmployeeTest.java
package answers.ch3.ex13;
========
package ch3.ex13;
>>>>>>>> origin/main:src/ch3/ex13/EmployeeTest.java

import answers.ch3.ex13.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob", "Bob", 100.00);
        Employee employee2 = new Employee("Sam", "Sam", 200.00);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println();

        employee1.setSalary(employee1.getSalary() + (employee1.getSalary() * 10 / 100));
        employee2.setSalary(employee2.getSalary() + (employee2.getSalary() * 10 / 100));

        System.out.println(employee1);
        System.out.println(employee2);


    }
}
