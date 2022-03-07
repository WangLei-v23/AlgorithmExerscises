package Algorithm.LeetCode.Primary.Array;

public class T217_containsDuplicate {
	
	/**
	 * 存在重复元素
	 * 思路1：每查找到一个，向之前所有元素比较（效率极低
	 * 思路2：先排序，后在遍历数组时每次与下一个做比较（效率较高
	 *  public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    	}

	 * 思路3：利用HashSet的唯一性，在每次添加的时候检查返回值来进行判断
	 * 这种可以适用于很多判断重复的问题，
	 * 它不仅仅适用于基本数据类型，也可以用在判断对象的重复。
	 * 可以说是种万金油的方法吧
	private Set save = new HashSet();
    public boolean containsDuplicate(int[] nums) {
        for(int a : nums){
            //Set.add(Object)添加失败会返回false
            if(!save.add(a))return true;         
        }
        return false;
    }
	 */
	
	public static boolean containsDuplicate(int[] nums) {

        if(nums.length<=1){return false;}

        for(int i=0;i<nums.length;i++){
        	
            for(int j=i+1;j<nums.length;j++){

                if(nums[i]==nums[j]){

                    return true;

                }

            }
        }
		return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,1};
		boolean b=containsDuplicate(a);
		System.out.println(b);
	}

}
