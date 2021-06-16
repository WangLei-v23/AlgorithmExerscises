package SouthWind.s015;

public class tets4 {
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {
            //修饰静态方法
            //如果使用syn修饰实例方法，则需要创建对象进行调用，锁的创建的对象的方法
            //如果业务需要创建多个对象，则无法进行线程同步
            //简单讲，需要明确上锁的资源，在内存中有几份
//            Thread thread = new Thread(tets4::syn);
//            thread.start();

            Thread thread2 = new Thread(tets4::syn2);
            thread2.start();
        }
    }

    public synchronized static void syn(){
        System.out.println("start=========");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("==========end");
    }

    public static void syn2(){
        synchronized (tets4.class){
            System.out.println("start=========");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("==========end");
        }
    }
}
