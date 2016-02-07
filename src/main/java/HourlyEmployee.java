
/**
 * Created by willhorton on 2/4/16.
 */
public class HourlyEmployee extends Employee {

    private int hoursWorked;
    private int hourlyRate;

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public HourlyEmployee(String name, int id, int hourlyRate) {
        super(name, id);
        this.hourlyRate = hourlyRate;
    }

    public int calculatePayDue() {
        setPayDue(hoursWorked * hourlyRate);
        return getPayDue();
    }

}
