package SouthWind.s008;

public class s008 implements s,t{
    @Override
    public void run() {

    }

    @Override
    public void laugh() {

    }

    public static void main(String[] args) {
        square square = new square(5,5,"red");
        System.out.println(square.perimeter());
        System.out.println(square.area());
        System.out.println(square.toString());
        square.colour("black");
        System.out.println(square.toString());
    }
}
