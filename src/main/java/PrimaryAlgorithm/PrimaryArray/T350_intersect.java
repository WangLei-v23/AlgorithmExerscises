package PrimaryAlgorithm.PrimaryArray;

import java.util.ArrayList;
import java.util.Arrays;


public class T350_intersect {
	
	
	/**
	 * 思路1：排好序后通过比较移动指针
	 * 注意越界，数组长度为0，和跳出循环的条件
	 * 思路2：使用Map，数组作为键值key，计数器作为value
	 * 思路3：将其中一个数组存入链表list1，遍历数组时使用contains比较，
	 * 将相同元素存入空链表list2中，同时删除list1中的元素
	 * 最后将list转换为数组输出
	 *  List<Integer> list=new ArrayList<Integer>();
        for(int i:nums1){
            list.add(i);
        }
        List<Integer> list1=new ArrayList<Integer>();
        for(int num:nums2){
            if(list.contains(num)){
                list1.add(num);
                list.remove(Integer.valueOf(num));                
            }
        }
        int[] res=new int[list1.size()];
        int i=0;
        for(int num:list1){
            res[i++]=num;
        }
        return res;
	 */
	
    public static int[] intersect(int[] nums1, int[] nums2) {
    	int[] error=new int [0];
    	if ((nums1.length==0||nums1==null)||(nums2.length==0||nums2==null)) {
    		return error;
			
		}
    	
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		ArrayList<Integer> a1=new ArrayList<Integer>();
    	for (int i = 0,j=0; i < nums1.length&&j<nums2.length;) {
			if (nums1[i]==nums2[j]) {
				a1.add(nums1[i]);
				i++;
				j++;
				continue;
			}
			if (nums1[i]<nums2[j]) {
				i++;
				continue;
			}
			if (nums1[i]>nums2[j]) {
				
				j++;
				continue;
			}
		}
    	
    	int [] b=new int[a1.size()];
    	int c=0;
    	for (int i : a1) {
			b[c++]=i;
		}
    	return  b;
    
        
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={1,2,2,1};
		int [] b={2,2};
		int[] c=intersect(a,b);
		System.out.println(Arrays.toString(c));
		

	}

}
