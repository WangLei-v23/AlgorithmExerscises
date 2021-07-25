package SouthWind.s030;

import SouthWind.s030.Impl.BigCar;
import SouthWind.s030.Impl.Xiaomi;
import SouthWind.s030.Inf.Car;
import SouthWind.s030.Inf.Phone;
import SouthWind.s030.Proxy.MyInvocationHandler;

public class Test2 {
    public static void main(String[] args) {
        //实例化动态代理类
        MyInvocationHandler handler = new MyInvocationHandler();
        //实例化委托对象
        Car bigCar = new BigCar();
        //获取动态生成的代理类(为与委托类保持一致，需要强转)
        Car proxyCar = (Car)handler.createProxy(bigCar);
        //执行委托类中的业务
        System.out.println(proxyCar.saleCar());
        Phone xiaomi = new Xiaomi();
        Phone proxyXiaomi =(Phone)handler.createProxy(xiaomi);
        System.out.println(proxyXiaomi.salePhone());
    }
}
