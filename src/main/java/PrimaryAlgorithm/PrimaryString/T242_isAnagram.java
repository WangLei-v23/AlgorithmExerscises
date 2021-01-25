package PrimaryAlgorithm.PrimaryString;

import java.lang.reflect.Array;
import java.util.Arrays;

public class T242_isAnagram {
	/**有效的字母异位词
	 * 
	 * 思路：
	 * 现将s,t转换为char[]c1,c2 (如果长度不相等，直接返回false
	 * 再将c1,c2排序，遍历比较，出现不同直接返回false
	 * 
	 */
    public static boolean isAnagram(String s, String t) {

    	boolean b=true;
    	char[] c1=s.toCharArray();
    	char[] c2=t.toCharArray();
    	if (c1.length!=c2.length) {
			return false;
		}
    	Arrays.sort(c1);
    	Arrays.sort(c2);
    	for (int j = 0,i=0; j < c1.length&&i < c2.length;j++,i++) {
			if (c1[j]!=c2[i]) {
				b=false;
				break;
			}
		}
		return b;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="asdfghjkl";
		String s2="lkjhgfdsa";
		boolean a= isAnagram(s1, s2);
		System.out.println(a);
	}

}
