package PrimaryArray;

import java.util.Arrays;

public class Array9 {
	/**两数之和
	 * 
	 */
    public static int[] twoSum(int[] nums, int target) {
    	if (nums==null||nums.length==0) {
			return null;
		}
    	int i=0;
    	int j=0;
    	for (; i < nums.length; i++) {
    		int a=target-nums[i];
    			for (j=i+1;  j< nums.length-1; j++) {
    				if (nums[j]==a) {
						break;
					}
    			}
    		if (nums[i]+nums[j]==target) {
				break;
			}		
		}
    	int [] b={i,j};
    	if (nums[i]+nums[j]!=target) {
			b=null;
		}
		return b;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2, 7, 11, 15};
		int b=13;
		int[] c=twoSum(a, b);
		System.out.println(Arrays.toString(c));
		
	}

}
