package ch10.ex12;

public class TestForEmpl {
    public static void main(String[] args) {
        EmployeeEx emp[] = new EmployeeEx[4];
        emp[0] = new CommissionEmployeeEx("Bob", "Boby", "123-123", 6000.0, 0.9, new DateEx(1, 1, 2000));
        emp[1] = new HourlyEmployeeEx("Mary", "May", "258-258", 55.26, 40.0, new DateEx(2, 2, 1990));
        emp[2] = new SalariedEmployeeEx("Shon", "Pen", "147-369", 250.55, new DateEx(3, 3, 2005));
        emp[3] = new BasePlusCommissionEmployeeEx("Vova", "Vovec", "123-987", 1.2, 0.5, 100.0, new DateEx(4, 4, 1980));


        for (EmployeeEx employeeEx : emp){
            System.out.printf("%s%n", employeeEx.earnings());
        }
    }
}
