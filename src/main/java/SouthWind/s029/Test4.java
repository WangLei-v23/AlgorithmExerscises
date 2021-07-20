package SouthWind.s029;

import SouthWind.s029.entity.cat;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test4 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取类的信息
        Class clazz = cat.class;
        //获取构造器
//        Constructor<cat> constructor = clazz.getConstructor(null);
        //获取实例
//        cat cat = constructor.newInstance(null);
        //合并为一步
        Object cat = clazz.getConstructor(null).newInstance(null);
        //获取方法
        Method setId = clazz.getDeclaredMethod("setId", int.class);
        Method setName = clazz.getDeclaredMethod("setName", String.class);
        Method setNeekName = clazz.getDeclaredMethod("setNeekName", String.class);
        //使用方法给字段赋值
        setId.invoke(cat,123);
        setName.invoke(cat,"lettle cat");
        setNeekName.invoke(cat,"mimi");
        System.out.println(cat.toString());
    }
}
