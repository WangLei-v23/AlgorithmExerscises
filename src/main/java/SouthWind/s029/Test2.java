package SouthWind.s029;

import SouthWind.s029.entity.cat;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1、通过类名获取
        Class class1 = Class.forName("SouthWind.s029.entity.cat");
        //2、通过类字面量获取
        Class class2= cat.class;
        //3、通过对象获取
        Class class3=new cat().getClass();
        System.out.println(class1==class2);
        System.out.println(class2==class3);
        System.out.println("===================================");
        //获取实现的接口
        Class[] interfaces = class3.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }
        //获取父类信息
        System.out.println(class3.getSuperclass());
        //获取包名
        System.out.println(class3.getPackage());
        //获取构造器
        Constructor <cat> constructor = class3.getConstructor(Integer.class, String.class);
        System.out.println(constructor);
        //获取所有构造器
        Constructor[] constructors = class3.getConstructors();
        for (Constructor constructor1 : constructors) {
            System.out.println(constructor1);
        }
        //调用构造器创建对象
        cat newInstance = constructor.newInstance(1, "大鱼");
        System.out.println(newInstance);
    }
}
