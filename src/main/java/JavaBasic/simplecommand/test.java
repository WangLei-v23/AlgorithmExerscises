package JavaBasic.simplecommand;

public class test {
    public static void main(String[] args) {
        int [] a={1,2,3,4};
        processArray processArray = new processArray(a, new outArray());
        processArray processArray1 = new processArray(a, new sumArray());
    }
}
