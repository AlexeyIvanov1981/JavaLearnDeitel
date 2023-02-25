<<<<<<<< HEAD:src/answers/ch3/ex13/Employee.java
package answers.ch3.ex13;
========
package ch3.ex13;
>>>>>>>> origin/main:src/ch3/ex13/Employee.java

public class Employee {
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return  "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", salary = " + salary;
    }
}
