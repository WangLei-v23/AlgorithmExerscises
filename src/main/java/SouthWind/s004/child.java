package SouthWind.s004;

public class child  extends parent{
    //静态资源
    public static stub stub=new stub("子类-静态资源");

    static {
        System.out.println("子类-静态代码块执行");
    }
    //动态资源
    stub stub2 =new stub("子类-动态资源");
    {
        System.out.println("子类-动态代码块执行");
    }
    //构造方法
    public child() {
        System.out.println("子类-构造器执行");
    }

    public void test(){
        System.out.println("子类方法执行");
    }

}
