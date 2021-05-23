package SouthWind.s009;

public class SuperCustomer extends customer{
    public String pay="超级会员打1折";

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    void welcome(){
        System.out.println("欢迎超级会员");
    }
}
