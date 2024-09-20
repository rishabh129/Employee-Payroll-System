import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Rishabh", 1,25000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Aditya", 2, 40, 100);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Details:- ");
        payrollSystem.displayEmployees();
    }
}
