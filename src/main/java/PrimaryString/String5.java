package PrimaryString;


public class String5 {
	/**验证回文字符串(即为中间对称的字符串，只考虑字母和数字字符，可以忽略字母的大小写。
	 * 思路：
	 * 先去除String中的所有标点和空格
	 * String>>char[]
	 * 截取前半段str1和逆序的后半段str2，对比
	 * 若两段字符串不相等，则false
	 * （时间太长不可取
	 * 
	 * 改进：
	 * 去除字符串中的特殊字符，保留字母和数字，
	 * 因为题目中忽略字母的大小写，所以我们也将字母全部转为小写好了。
	 * 这里可以使用 replaceAll() 和 toLowerCase() 方法；
	 * 然后在char[]中正逆序互相比较即可
	 */
    public static boolean isPalindrome(String s) {
        boolean b=true;
//        String str1=s.replace(" ","");
//        String str2=str1.replaceAll("[\\pP\\p{Punct}]","");
//    	  String str1=str.replaceAll("['-'^a-z]","");//去除a-z
        s = s.replaceAll("[^a-z^A-Z^0-9]", "").toLowerCase();
        char[] c1=s.toCharArray(); 
        System.out.println(c1);
        for (int i = 0; i < c1.length/2; i++) {
			if (c1[i]!=c1[c1.length-1-i]) {
				b=false;
				break;
			}
		}
        
//        String s1="";String s2="";
//        for (int j = 0; j < c1.length/2; j++) {
//			s1+=c1[j];
//		}
//        for (int i = c1.length-1; i >(c1.length-1)/2; i--) {
//        	s2+=c1[i];
//		}
//        
//        
//        if (!s1.equalsIgnoreCase(s2)) {
//			b= false;
//		}
        return b;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="`l;`` 1o1 ??;l`";
		boolean b=isPalindrome(s);
		System.out.println(b);

	}

}
