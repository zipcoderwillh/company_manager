
import java.util.ArrayList;

/**
 * Created by willhorton on 2/4/16.
 */
public class CompanyManager {

    private ArrayList<Employee> employees = new ArrayList<>();

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee getEmployee(int id) {

        Employee thisEmployee = null;

        for(Employee employee : employees) {
            if(employee.getId() == id) {
                thisEmployee = employee;
            }
        }

        return thisEmployee;

    }

    public int calculateTotalPayDue() {

        int total = 0;

        for(Employee employee : employees) {
            total += employee.calculatePayDue();
        }

        return total;

    }

    public int calculateTotalHourlyDue() {

        int total = 0;

        for(Employee employee : employees) {
            if(employee instanceof HourlyEmployee) {
                total += employee.calculatePayDue();
            }
        }

        return total;

    }

    public int calculateTotalSalariedDue() {

        int total = 0;

        for(Employee employee : employees) {
            if(employee instanceof SalariedEmployee) {
                total += employee.calculatePayDue();
            }
        }

        return total;

    }

    public static void main(String[] args) {

        CompanyManager companyManager = new CompanyManager();
        companyManager.addEmployee(new HourlyEmployee("Steve", 1, 20));
        companyManager.addEmployee(new Manager("Bob", 2, 1500));
        companyManager.addEmployee(new Executive("Lumbergh", 3, 1000));

        HourlyEmployee steve = (HourlyEmployee)companyManager.getEmployee(1);
        steve.setHoursWorked(80);
        Manager bob = (Manager)companyManager.getEmployee(2);
        bob.setBonusPay(500);
        Executive lumbergh = (Executive)companyManager.getEmployee(3);
        lumbergh.setStockOptions(100000);

        for(Employee employee : companyManager.getEmployees()) {
            System.out.printf("%s's total pay due is %,d\n", employee.getName(), employee.calculatePayDue());
        }

        System.out.println();

        System.out.printf("Total hourly pay due is %,d\n", companyManager.calculateTotalHourlyDue());
        System.out.printf("Total salaried pay due is %,d\n", companyManager.calculateTotalSalariedDue());

    }

}