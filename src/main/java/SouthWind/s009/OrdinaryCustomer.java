package SouthWind.s009;

public class OrdinaryCustomer extends customer{
    public String pay="普通会员打9折";

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    void welcome(){
        System.out.println("普通会员不欢迎");
    }
}
