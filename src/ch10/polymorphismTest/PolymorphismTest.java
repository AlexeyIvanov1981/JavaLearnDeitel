package ch10.polymorphismTest;

import ch9.commissionEmployee.BasePlusCommissionEmployee;
import ch9.commissionEmployee.CommissionEmployee;

public class PolymorphismTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Bob", "Bi",
                "111-11-111", 10000.0, 0.06);

        BasePlusCommissionEmployee basePlusCommissionEmployee1 = new BasePlusCommissionEmployee("John",
                "Doe", "222-222-22", 5000.0, 0.2, 300);

        System.out.printf("%s %s:%n%n%s%n%n", "Call CommissionEmployee's toString with superclass reference ",
                "to superclass object", commissionEmployee.toString());

        System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployee's toString with subclass",
                "reference to subclass object", basePlusCommissionEmployee1.toString());

//        CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee1;
    }
}
