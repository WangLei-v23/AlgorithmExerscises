package SouthWind.s030.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

    //注入委托对象
    private Object obj;
    //生成代理对象
    public Object createProxy(Object object){
        this.obj=object;
        System.out.println("生成动态代理对象!");
        /**
         * 三个参数
         * 类加载器 ClassLoader
         * 委托类的接口
         * 当前 InvocationHandler 实例对象
         */
        return Proxy.newProxyInstance(MyInvocationHandler.class.getClassLoader(),
                obj.getClass().getInterfaces(),this);
    }


    /**实现核心业务代码和辅助代码整合
     * 由于在生成的代理类对象后，并不知道要执行的委托对象方法
     * 所以在生成的代理对象执行业务方法时，InvocationHandler接口将方法映射到invoke，
     * 并获取该方法和形参，传入invoke
     * 执行invoke，利用反射，执行委托对象的方法
     * 辅助业务也写在invoke中
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //核心业务代码委托对象来完成，方法由委托对象来调用
        System.out.println("启用动态代理~~~");
        Object invoke = method.invoke(this.obj, args);
        return invoke;
    }
}
