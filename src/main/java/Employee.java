
/**
 * Created by willhorton on 2/4/16.
 */
public abstract class Employee {

    private String name;
    private int id;
    private int payDue;

    abstract int calculatePayDue();

    public int getPayDue() {
        return payDue;
    }

    public void setPayDue(int payDue) {
        this.payDue = payDue;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }


}
