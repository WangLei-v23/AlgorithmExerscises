package SouthWind.s030;

import SouthWind.s030.Impl.Huawei;
import SouthWind.s030.Impl.Xiaomi;
import SouthWind.s030.Proxy.PhoneProxy;

public class Test {
    public static void main(String[] args) {
        Huawei huawei = new Huawei();
        Xiaomi xiaomi = new Xiaomi();
        PhoneProxy proxy=new PhoneProxy(huawei);
        System.out.println(proxy.salePhone());
        proxy=new PhoneProxy(xiaomi);
        System.out.println(proxy.salePhone());
    }
}
