package ch9.commissionEmployeeExtend;

public class CommissionEmployeTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Alex", "Testman",
                "369-36-369", 0.8, 0.5);

        double result = commissionEmployee.earnings();
        System.out.println(result);

        System.out.println(commissionEmployee.toString());
    }
}
