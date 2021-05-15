package SouthWind.s002;


public class s002 {

    @FunctionalInterface
    interface saySomthing{
        void say();
    }

    public static void main(String[] args) {
        saySomthing s=()->System.out.println("hello world!");
        s.say();

    }
}

