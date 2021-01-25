package PrimaryAlgorithm.PrimaryArray;

import java.util.Arrays;

public class Array7 {
	/**
	 *思路1：从后往前遍历，遇到10就进位，直到digits[0]
	 *思路2：将数组存为链表，从后往前遍历，遇到10就进位，直到gitits[0]
	 *输出时再将链表转换为数组；
	 */
	
	
	
	
	
    public static int[] plusOne(int[] digits) {
    	int[] addone;
    	int[] error={};
    	if (digits==null||digits.length==0) {
			return error;
		}

    	int len=digits.length;
    	digits[len-1]+=1;
    	
    	for (int i = len-1; i >0; i--) {
			if (digits[i]==10) {
				digits[i]=0;
				digits[i-1]+=1;
				continue;
			}
		}
    	
    	if (digits[0]==10) {
    		addone=new int [len+1];
    		addone[0]=1;addone[1]=0;
    		for (int i = 2; i <addone.length; i++) {
				addone[i]=digits[i-1];
			}
    		return addone;
		}
    	
		return digits;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={9,9};
		int[] b=plusOne(a);
		System.out.println(Arrays.toString(b));
	}

}
