 //package PrimaryString;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class String3 {
//	/**字符串中的第一个唯一字符
//	 *思路：先排序，再将唯一字符存入list，接着遍历char[]
//	 *遍历时与list中的字符比较，第一个匹配到的元素即为第一个唯一字符
//	 *
//	 *要点：边界条件，空,0,1长度char[]的处理
//	 */
//
//	public static int firstUniqChar(String s){
//		char[] c=s.toCharArray();
//		char[] c1=s.toCharArray();
//		if(c1.length==0) {
//			return -1;
//		}
//		if(c1.length==1) {
//			return 0;
//		}
//		Arrays.sort(c1);
//
//		ArrayList<Character> c2=new ArrayList<>();
////		System.out.println(c1);
//lab:	for (int j = 0; j < c1.length; j++) {
//
//			if (j==c1.length-1) {
//				if (c1[j]==c1[j-1]) {
//					break;
//				}
//				if (c1[j]!=c1[j-1]) {
//					c2.add(c1[j]);
//					break;
//				}
//			}
//
//			if (c1[j]==c1[j+1]) {
//				for (int i = j; i < c1.length; i++) {
//					if (c1[i]!=c1[j]) {
//						j=i-1;
//						continue lab;
//					}
//				}
//			}
//
//			if (c1[j]!=c1[j+1]) {
//				c2.add(c1[j]);
//			}
//		}
////		System.out.println(c2);
//
//		if (c2.size()==0) {
//			return -1;
//		}
////		System.out.println(c);
//		int i=-1;//始终指向非重复数
//		for (int j = 0; j < c.length; j++) {
//			if (c2.contains(c[j])) {
//				i=j;
////				System.out.println(i);
//				break;
//			}
//		}
//
//		return i;
//
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub "loveleetcode"
//		String s="loveleetcode";//"lcvlocvoe" "leetcode" "eakjkae" "eeeaaakkkerrrr"
//		int a=firstUniqChar(s);
//
//		System.out.println(a);
//	}
//
//}
