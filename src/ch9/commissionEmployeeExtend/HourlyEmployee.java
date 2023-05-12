package ch9.commissionEmployeeExtend;

public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);

        if (hours >= 0.0 && hours <= 168.0) {
            this.hours = hours;
        } else throw new IllegalArgumentException("Hours must be in range 0 - 168");

        if (wage > 0.0) {
            this.wage = wage;
        } else throw new IllegalArgumentException("Wage must be more 0");
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours >= 0.0 && hours <= 168.0) {
            this.hours = hours;
        } else throw new IllegalArgumentException("Hours must be in range 0 - 168");
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage > 0.0) {
            this.wage = wage;
        } else throw new IllegalArgumentException("Wage must be more 0");
    }

    public double earnings() {
        double result;
        if (getHours() > 40.0) {
            result = wage * (40 + (getHours() - 40) * 1.5);
        } else result = wage * getHours();
        return result;
    }

    @Override
    public String toString() {
        return "Name: " + getFirstName() + "\n" +
                "Surname: " + getLastName() + "\n" +
                "Social security number: " + getSocialSecurityNumber() + "\n" +
                "Hours: " + hours + "\n" +
                "Wage: " + wage + "\n" +
                "Earnings: " + earnings();
    }
}
