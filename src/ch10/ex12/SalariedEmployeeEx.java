package ch10.ex12;

public class SalariedEmployeeEx extends EmployeeEx{
    private double weeklySalary;

    public SalariedEmployeeEx(String firstName, String lastName, String socialSecurityNumber, double weeklySalary, DateEx birthDay) {
        super(firstName, lastName, socialSecurityNumber, birthDay);

        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        } else
            this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        } else
            this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
    }
}
