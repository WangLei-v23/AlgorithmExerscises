package JavaBasic.simplefactory;

public class test {
    public static void main(String[] args) {
        Output m = new massage();
        m.soutString();
//        Object o=m;

        OutputFactory factory = new OutputFactory();
        computer computer = new computer(factory.getOutput());

    }
}
