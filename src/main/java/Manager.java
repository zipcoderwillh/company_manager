
/**
 * Created by willhorton on 2/4/16.
 */
public class Manager extends SalariedEmployee {

    private int bonusPay;

    public int getBonusPay() {
        return bonusPay;
    }

    public void setBonusPay(int bonusPay) {
        this.bonusPay = bonusPay;
    }

    public Manager(String name, int id, int basePay) {
        super(name, id, basePay);
    }

    public int calculatePayDue() {
        setPayDue(getBasePay() + bonusPay);
        return getPayDue();
    }

}
