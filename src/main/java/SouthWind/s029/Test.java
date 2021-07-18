package SouthWind.s029;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class Test {

    private static Properties properties;
    static {
        try {
            properties=new Properties();
            properties.load(new FileInputStream(System.getProperty("user.dir")+"/src/main/java/SouthWind/s029/bean.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(properties);
        //获取目标类名
        String bean=properties.getProperty("bean");
        //根据目标类名获取目标类所对应的Class对象（描述结构）
        Class clazz=Class.forName(bean);
        //获取构造器
        Constructor constructor=clazz.getConstructor(null);
        //通过构造器创建对象
        System.out.println(constructor.newInstance(null));
    }
}
