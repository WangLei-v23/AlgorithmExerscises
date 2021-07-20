package SouthWind.s029;

import SouthWind.s029.entity.cat;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Test3 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<cat> class1 = cat.class;
        //获取公有属性数组
        Field[] fields = class1.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("=======================================");
        //获取属性数组（对访问权限修饰符无要求）
        Field[] declaredFields = class1.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("=======================================");
        //根据属性名获取公有属性
        Field neekName = class1.getField("neekName");
        System.out.println(neekName);
        System.out.println("=======================================");
        //根据属性名获取属性
        Field id = class1.getDeclaredField("id");
        System.out.println(id);
        System.out.println("=======================================");

        //获取无参构造器
        Constructor<cat> constructor = class1.getConstructor(null);
        cat cat = constructor.newInstance(null);
        //获取属性
        Field name = class1.getDeclaredField("name");
        //设置暴力反射，即使是私有属性，也能强行赋值(不推荐使用)
        name.setAccessible(true);
        //赋值
        name.set(cat,"大猫");
        System.out.println(cat.toString());

    }
}
