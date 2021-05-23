package SouthWind.s004;

public class parent {
    //静态资源
    public static stub stub=new stub("父类-静态资源");

    static {
        System.out.println("父类-静态代码块执行");
    }
    //动态资源
    stub stub2 =new stub("父类-动态资源");
    {
        System.out.println("父类-动态代码块执行");
    }
    //构造方法
    public parent() {
        System.out.println("父类-构造器执行");
    }
}
