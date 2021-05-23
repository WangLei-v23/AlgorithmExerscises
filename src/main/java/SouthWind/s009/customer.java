package SouthWind.s009;

public class customer {
    public String pay="会员打折";

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    void welcome(){
        System.out.println("欢迎会员");
    }
}
