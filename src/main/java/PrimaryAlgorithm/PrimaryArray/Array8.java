package PrimaryArray;

import java.util.Arrays;


public class Array8 {
	/**
	 *思路1：每次遍历遇到0,x的情况就互换，互换后重置i,j
	 *超时不可取
	    int i=1,j=0,len=nums.length;
    	if (nums!=null||nums.length!=0) {
    		for (;i<len&&j<i;i++,j++) {
    			if (nums[j]==0&&nums[i]!=0) {
//    				System.out.println("i="+i+";j="+j+"时互换，此时数组为"+Arrays.toString(nums));
    				int temp=nums[i];
    				nums[i]=nums[j];
    				nums[j]=temp;
    				i=0;
    				j=i-1;
//    				System.out.println("互换后的数组为"+Arrays.toString(nums));
    				continue;
    			}
       		}
		}
	
	思路2：i始终指向遇到的第一个0，j始终指向遇到的第一个非0数，
	当i指向0的时候，停止，j开始跑
	如果j跑到i后面，就互换，互换后j回到i的位置（此时nums[i]为非0数）,继续往后跑，
	直到所有0沉到底部（冒泡思想
	中断条件：0之后再无非0的数，即
	 */
	
    public static void moveZeroes(int[] nums) {
    	int i = 0;//指向0
    	int j = 0;//指向非零元素
    	int e=0;//已经沉底的0的个数
    	lab:for (; i < nums.length; i++) {
    			if (nums[i]==0) {
    				for (; j < nums.length-e; j++) {
    					if (j>i&&nums[j]!=0) {
    				//	System.out.println("i="+i+";j="+j+"时互换，此时数组为"+Arrays.toString(nums));
        				int temp=nums[i];
        				nums[i]=nums[j];
        				nums[j]=temp;
        				j=i;
        			
        			//	System.out.println("互换后的数组为"+Arrays.toString(nums)+",此时i="+i+";j="+j);
        				continue lab;
        				
    					}
    				}
    			}
		}
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={0,1,0,3,12 };//0,1,0,3,12 
		moveZeroes(a);
		System.out.println(Arrays.toString(a));
	}

}
