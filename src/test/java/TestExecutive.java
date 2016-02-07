
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by willhorton on 2/4/16.
 */
public class TestExecutive {

    Executive employee;

    @Before
    public void initialize() {
        employee = new Executive("Andy", 16, 8000);
    }

    @Test
    public void testCalculatePay() {
        employee.setStockOptions(2000);
        assertEquals(10000, employee.calculatePayDue());
    }

}
