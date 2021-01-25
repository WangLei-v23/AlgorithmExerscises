package PrimaryAlgorithm.PrimaryString;

public class T14_longestCommonPrefix {
	/**最长公共前缀
	 *
	 */
    public static String longestCommonPrefix(String[] strs) {
    	if (strs.length==0||strs==null) {
			return "";
		}
    	if (strs.length==1) {
			return strs[0];
		}
    	//求出最短数据项的长度
    	int len=100;
    	for (int i = 0; i < strs.length; i++) {
			if (strs[i].length()<len) {
				len=strs[i].length();
			}
		}
//    	System.out.println(len);
    	StringBuilder sb=new StringBuilder();//使用不定长字符串比String+=xx更快;
    	//StringBuilder线程不安全,速度较快
    	//StringBuffer线程安全,速度较慢
    	int i = 0;//取字符串数组项的对应的位数 
    	
lab:   	for (; i < len; i++) {//对字符串数组项进行遍历
			for (int j = 0; j < strs.length-1;j++) {//对字符串数组进行遍历
				if (strs[j].equals("")) {
					return "";
				}
				if (strs[j].charAt(i)!=strs[j+1].charAt(i)) {
					return sb.toString();
				}
				if (strs[j].charAt(i)==strs[j+1].charAt(i)) {
					if (j+1==strs.length-1) {
						sb.append(strs[j].charAt(i));
						continue lab;
					}
				}
			}
		}

		return sb.toString();
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"acc","aaa","aaba"};
		System.out.println(longestCommonPrefix(s));
	}

}
