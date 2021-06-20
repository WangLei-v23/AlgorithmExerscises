package SouthWind.s016;

public class test {
    public static void main(String[] args) {
//        for (int i = 0; i <10 ; i++) {
//            System.out.println(singleDemo.getInstance());
//        }
        new Thread(()->{
            System.out.println(singleDemo.getInstance());
        }).start();

        new Thread(()->{
            System.out.println(singleDemo.getInstance());
        }).start();
    }
}
