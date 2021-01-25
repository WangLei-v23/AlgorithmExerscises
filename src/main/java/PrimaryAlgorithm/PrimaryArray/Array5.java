package PrimaryAlgorithm.PrimaryArray;

import java.util.Arrays;
/**
 *思路1：先排序，后两两比较，因为数组必为奇数，故不同的那一组中，第一个即为所求
 *		需要注意的是，下标越界以及中断循环的情况
 *思路2：使用异或，遍历一遍后所得即为不重复数字
 *      int n=0;
        for(int i=0;i<nums.length;i++)
              n^=nums[i];
        return n;
        ^是异或运算符，异或的规则是转换成二进制比较，相同为0，不同为1.
		一个数a与另一个数b异或的结果等于a^b，用结果（ a^b)异或a，就会得到b；
 */

public class Array5 {
    public static int singleNumber(int[] nums) {
    	if (nums.length==0||nums==null) {
			return 0;
		}
    	
    	int a=0;
    	Arrays.sort(nums);
  
  lab:  for (int i = 0; i < nums.length; i+=2) {
	  		
	  		if (i>=nums.length-1) {
				a=nums[nums.length-1];
				break;
			}
	  		if(nums[i]==nums[i+1]) {
	  			
	  			continue lab;
	  		}
	  		if (nums[i]!=nums[i+1]) {
				a=nums[i];
				break;
	  		}
	  		
		}
		return a;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b={2,2,1};
		//Arrays.parallelSort(b);
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		int c=singleNumber(b);
		System.out.println(c);
	}

}
