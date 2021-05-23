package SouthWind.s009;

public class Cashier {
    private customer customer;

    public SouthWind.s009.customer getCustomer() {
        return customer;
    }

    public void setCustomer(SouthWind.s009.customer customer) {
        this.customer = customer;
    }

    public void settlement(){
        this.customer.welcome();
        System.out.println(this.customer.getPay());
    }
}
