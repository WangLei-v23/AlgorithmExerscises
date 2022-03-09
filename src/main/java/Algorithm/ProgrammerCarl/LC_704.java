package Algorithm.ProgrammerCarl;

public class LC_704 {

    public static int search(int[] nums, int target) {
        //while循环收敛即可 注意因边界不同产生的两种写法
        //1 [left,right]  2 [left,right)
        if (nums.length==0)return -1;
        if (nums.length==1)return (nums[0]==target)?0:-1;
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int middle=left+((right-right)>>1);
            //命中target
            if (nums[middle]==target)return middle;
            //targte在右 改变left
            if (nums[middle]<target){
                left=middle+1;
            }
            //target在左 改变right
            if (nums[middle]>target){
                right=middle-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6,7};
        int search = search(nums, 4);
        System.out.println("target下标==>"+search);
    }
}
