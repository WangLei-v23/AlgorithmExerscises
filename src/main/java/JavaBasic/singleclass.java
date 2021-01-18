package JavaBasic;

/**
 * @ClassName: singleclass
 * @Description:
 * @Author: WangLei
 * @Date: 2021/1/14 19:41
 */
public class singleclass {


    public static void main(String[] args) {
        single s=single.getSingle();
        //多次创建实例，只是将引用指向了同一片内存地址
        single d=single.getSingle();
        System.out.println(s==d);
    }
}

class single{
    //缓存该类的唯一类型引用
    public static single obj;
    //隐藏该类的构造器
    private single(){
        System.out.println("创建了单例对象");
    }
    //获取该类的唯一实例
    public static single getSingle(){
        if (obj==null){
            obj=new single();
        }
        return obj;
    }
}
