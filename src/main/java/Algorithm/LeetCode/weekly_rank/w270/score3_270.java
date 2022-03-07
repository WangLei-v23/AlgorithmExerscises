package Algorithm.LeetCode.weekly_rank.w270;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class score3_270 {

    public static void main(String[] args) {
        int [] case1={2,1,3,0};
        int[] evenNumbers = findEvenNumbers(case1);
        for (int val:evenNumbers
             ) {
            System.out.print(val+" ");
        }
    }


    public static int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> integers = new ArrayList<>();
        HashMap<Integer, Integer> ns = new HashMap<>();
        for (int i = 0; i <digits.length ; i++) {
            int num=digits[i];
            int count=0;
            for (int j = 0; j <digits.length ; j++) {
                if (digits[j]==num){
                    count++;
                }
            }
            if (count>3){
                count=3;
            }
            ns.put(num,count);
        }
//        System.out.println(ns.toString());
        for (int i = 100; i <1000 ; i++) {
            char[] chars = String.valueOf(i).toCharArray();
            String [] strs=new String[chars.length];
            int [] nums=new int[chars.length];
            for (int j = 0; j <chars.length ; j++) {
                int parseInt = Integer.parseInt(chars[j] + "");
                nums[j]=parseInt;
            }
            HashMap<Integer, Integer> digns = new HashMap<>();
            for (int j = 0; j < nums.length; j++) {
                int num=nums[j];
                int count=0;
                for (int k = 0; k <nums.length ; k++) {
                    if (nums[k]==num){
                        count++;
                    }
                }
                digns.put(num,count);
            }
            if(compareMap(ns,digns)&&i%2==0){
                integers.add(i);
            }
        }
        int [] result=new int[integers.size()];
        for (int i = 0; i <integers.size();i++) {
            result[i]=integers.get(i);
        }

        return result;
    }

    //比较是否符合要求
    public static boolean compareMap(HashMap<Integer, Integer> ns, HashMap<Integer, Integer> digns) {
        AtomicBoolean result= new AtomicBoolean(true);

        digns.forEach((key,value)->{
            int count=value;
            if (ns.get(key)==null){
                result.set(false);
            }else{
                if ((ns.get(key)-value)<0){
                    result.set(false);
                }
            }
        });
        return result.get();
    }


}
