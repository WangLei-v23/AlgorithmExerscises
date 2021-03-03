package JavaBasic.simplecommand;

public class sumArray implements process{
    @Override
    public void processArrray(int[] a) {
        int sum=0;
        for(int b: a){
            sum+=b;
        }
        System.out.println(sum);
    }
}
