
/**
 * Created by willhorton on 2/4/16.
 */
public abstract class SalariedEmployee extends Employee {

    private int basePay;

    public int getBasePay() {
        return basePay;
    }

    public SalariedEmployee(String name, int id, int basePay) {
        super(name, id);
        this.basePay = basePay;
    }

}
