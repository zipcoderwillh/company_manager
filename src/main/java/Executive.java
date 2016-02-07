
/**
 * Created by willhorton on 2/4/16.
 */
public class Executive extends SalariedEmployee {

    private int stockOptions;

    public int getStockOptions() {
        return stockOptions;
    }

    public void setStockOptions(int stockOptions) {
        this.stockOptions = stockOptions;
    }

    public Executive(String name, int id, int basePay) {
        super(name, id, basePay);
    }

    public int calculatePayDue() {
        setPayDue(getBasePay() + stockOptions);
        return getPayDue();
    }

}
