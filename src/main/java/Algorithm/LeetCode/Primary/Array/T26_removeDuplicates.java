package Algorithm.LeetCode.Primary.Array;

public class T26_removeDuplicates {
	public static int removeDuplicates(int[] nums) {
		/**
		 * 先理解题意：
		        给定数组 nums = [1,1,2], 
			函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。 
			你不需要考虑数组中超出新长度后面的元素。
			(也就数说，修改过的数组为nums=[1,2,1];
			返回的新长度2，其实就是不重复元素的个数
		
		思路：因为是排序数组，所以重复项在相邻的位置上，
		若nums[i-1] == nums[i]，则nums[i]为重复项。
		假设len为慢指针，i为快指针，初始时len=0，i=1
		然后从第2个位置开始至数组末尾遍历数组，当遇到重复项时，不做操作，继续遍历；
		(i往后跑，len停在重复项中第一个的位置，原地不动
		当遇到非重复项时，len跳到第二个重复项的位置，
		(即len++.
		再把非重复项nums[i]放到nums[len]的位置上。
		(nums[len]=nums[i]
		遍历结束后nums[0...len-1]为删除重复项后的数组，返回新数组长度len+1。
		 */
		if (nums==null||nums.length==0) {
			return 0;
		}
		
		int len=0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i-1]==nums[i]) {
				continue;
			}
			len++;
			nums[len]=nums[i];
		}
		return len+1;
	
    }
	
	public static void main(String[] args) {
		int [] num={1,2,3,3,4,4,5};
		int len=removeDuplicates(num);
		System.out.println(len);
	}
}
