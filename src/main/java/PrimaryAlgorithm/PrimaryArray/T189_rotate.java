package PrimaryAlgorithm.PrimaryArray;

import java.util.Arrays;

public class Array3 {
	/**给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
	 *  输入: [1,2,3,4,5,6,7] 和 k = 3
		输出: [5,6,7,1,2,3,4]
		
		思路1：每移动一个元素，整个数组旋转一次（
		思路2：取余法。利用(i + k) % n = 旋转后的位置（i为第i个元素
			     可以将原有数组中的数据复制到新数组中
	k =  k % nums.length;
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        result[(i + k) % nums.length] = nums[i];
    }
    return result;
	 */
	
	public static int[] rotate(int[] nums, int k) {
		if (nums==null||nums.length==0) {
			return null;
		}
        for (int i = k; i >0; i--) {
			for (int j = 0; j < nums.length; j++) {
				int temp=nums[nums.length-1];
				nums[nums.length-1]=nums[j];
				nums[j]=temp;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5,6,7};
		int k=4;
		int [] b=rotate(a, k);
		System.out.println(Arrays.toString(b));
		
		

	}

}
