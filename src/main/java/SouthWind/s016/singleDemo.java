package SouthWind.s016;

public class singleDemo {

    private  static  singleDemo instance;
    //给方法加锁
//    public synchronized static singleDemo getInstance() {
//        if (instance==null){
//            instance=new singleDemo();
//        }
//        return instance;
//    }
    //给代码块加锁
    public static singleDemo getInstance() {
            synchronized (singleDemo.class){
                if (instance==null){
                    instance=new singleDemo();
                }
                return instance;
            }

    }

    private  singleDemo() {
        System.out.println("创建singleDemo对象");
    }
}
