package ch9.ex3;

public class BasePlusCommissionEmployee1 {
    private double baseSalary;
    CommissionEmployee1 commissionEmployee1;

    public BasePlusCommissionEmployee1(CommissionEmployee1 commissionEmployee1, double baseSalary) {

        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
        this.commissionEmployee1 = commissionEmployee1;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }


    public double earnings() {
        return getBaseSalary() + commissionEmployee1.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried",
                super.toString(), "base salary", getBaseSalary());
    }
}
