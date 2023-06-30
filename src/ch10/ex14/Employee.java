package ch10.ex14;

import ch10.ex12.DateEx;

public abstract class Employee {
    private DateEx birthDate;
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber, DateEx birthDate) {
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public DateEx getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(DateEx birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s%n%s",
                getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate());
    }

    public abstract double earnings();
}
