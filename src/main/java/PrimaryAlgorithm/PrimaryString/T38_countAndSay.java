package PrimaryAlgorithm.PrimaryString;

public class String8 {
	/**报数
	 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数,得到下一个数。
	 * 其前五项如下
1.     1
2.     11
3.     21
4.     1211
5.     111221
	 * 思路:递归求解,除了n=1时直接返回以外,其他情况进入递归
	 * 先考虑递归出口，也就是最简单情况的结果。
	 * 考虑第二轮跟第一轮的关系,涉及到在代码的何处加 function（n-1）
	 * 最后把代码整体逻辑想清楚，确定每一轮的调用都是如此，才可递归进行。
	 * 
	 * 关于String str=countAndSay(n-1)+"#"(其实+什么都一样(除了数字)
	 * 中+"#"的解释:
	 * +"#"方便统一处理字符数组,不用判断遍历到最后一位,比较时出现的越界情况
	 * 
	 * 详细解释:
	 * 因为字符数组c的最后一位是"#"
	 * 为了避免比较c[i]和c[i+1]时,当i=c.length-1时出现的c[i+1]的越界问题
	 * 因为c[c.length-1]="#"
	 * 当i=c.length-2,i+1=c.length-1时,
	 * 此时c[c.length-2]!="#",刚好可以遍历到最后一位数字
	 * 继续遍历,这时i=c.length-1 循环终止,同时不越界
	 * 达成了一种,将所有数字添加到stringbuilder的情况下
	 * 同时隔离了位于最后一位的"#"的效果.
	 * 
	 * 习得经验:
	 * 通过在数组后添加额外项的方式,避免了在遍历比较的情况下,
	 * 会出现的数组下标越界问题;
	 * 
	 * 
	 * 
	 * 
	 */

    public static String countAndSay(int n) {
    	
    	if (n<=0) {
			return null;
		}
    	if (n==1) {
			return "1";
		}
    	
    	int count=1;
    	String str=countAndSay(n-1)+"#";
    	char[] c=str.toCharArray();
    	StringBuilder s=new StringBuilder();
    	
    	for (int i = 0; i <c.length-1; i++) {
			if (c[i]==c[i+1]) {
				count++;
				
			}
			if (c[i]!=c[i+1]) {//忽略了字符数组的最后一位"#"
				s.append(count);
				s.append(c[i]);//位于c[i+1]位的"#"不再添加进stringbuilder中
				count=1;
			}
		}
    	
		return s.toString();
    	
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=countAndSay(3);
		System.out.println(a);
	}

}
