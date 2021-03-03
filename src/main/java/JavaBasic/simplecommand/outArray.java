package JavaBasic.simplecommand;

public class outArray implements process{
    @Override
    public void processArrray(int[] a) {
        StringBuilder s=new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
        }
        System.out.println(s);
    }
}
