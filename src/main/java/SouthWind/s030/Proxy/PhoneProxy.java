package SouthWind.s030.Proxy;

import SouthWind.s030.Inf.Phone;

public class PhoneProxy implements Phone {

    private Phone phone;

    public PhoneProxy(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String salePhone() {
        return "使用代理类实现->"+this.phone.salePhone();
    }
}
