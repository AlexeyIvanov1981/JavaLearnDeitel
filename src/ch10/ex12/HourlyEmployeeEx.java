package ch10.ex12;

public class HourlyEmployeeEx extends EmployeeEx {
    private double wage;
    private double hours;

    public HourlyEmployeeEx(String firstName, String lastName, String socialSecurityNumber, double wage, double hours, DateEx birthDay) {
        super(firstName, lastName, socialSecurityNumber, birthDay);

        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        } else this.wage = wage;

        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");
        } else this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        } else this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");
        } else this.hours = hours;
    }

    @Override
    public double earnings() {
        if (getHours() <= 40) // no overtime
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }
}
