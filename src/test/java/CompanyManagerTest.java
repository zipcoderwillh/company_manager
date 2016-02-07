
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by willhorton on 2/4/16.
 */
public class CompanyManagerTest {

    CompanyManager companyManager;
    HourlyEmployee employee;
    Manager manager;
    Executive executive;

    @Before
    public void setUp() throws Exception {
        companyManager = new CompanyManager();
        employee = new HourlyEmployee("Steve", 5, 15);
        manager = new Manager("Bob", 6, 1500);
        executive = new Executive("Jack", 7, 3000);

        companyManager.addEmployee(employee);
        companyManager.addEmployee(manager);
        companyManager.addEmployee(executive);

        employee.setHoursWorked(40);
        manager.setBonusPay(200);
        executive.setStockOptions(1000);
    }

    @Test
    public void testAddEmployee() throws Exception {
        companyManager.addEmployee(employee);
        assertTrue(companyManager.getEmployees().contains(employee));
    }

    @Test
    public void testGetEmployee() throws Exception {
        companyManager.addEmployee(employee);
        assertEquals(employee, companyManager.getEmployee(5));
    }

    @Test
    public void testCalculateTotalHourlyDue() throws Exception {
        assertEquals(600, companyManager.calculateTotalHourlyDue());
    }

    @Test
    public void testCalculateTotalSalariedDue() throws Exception {
        assertEquals(5700, companyManager.calculateTotalSalariedDue());
    }

    @Test
    public void testCalculateTotalPayDue() throws Exception {
        assertEquals(6300, companyManager.calculateTotalPayDue());
    }


}