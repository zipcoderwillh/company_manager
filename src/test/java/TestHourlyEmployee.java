
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by willhorton on 2/4/16.
 */
public class TestHourlyEmployee {

    HourlyEmployee employee;

    @Before
    public void initialize() {
        employee = new HourlyEmployee("Steve", 12, 18);
    }

    @Test
    public void testCalculatePay() {
        employee.setHoursWorked(80);
        assertEquals(1440, employee.calculatePayDue());
    }


}
