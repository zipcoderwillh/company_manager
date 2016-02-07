
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by willhorton on 2/4/16.
 */
public class TestManager {

    Manager employee;

    @Before
    public void initialize() {
        employee = new Manager("Doug", 14, 2000);
    }

    @Test
    public void testCalculatePay() {
        employee.setBonusPay(500);
        assertEquals(2500, employee.calculatePayDue());
    }

}
