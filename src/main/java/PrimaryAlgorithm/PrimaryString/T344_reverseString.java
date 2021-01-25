package PrimaryAlgorithm.PrimaryString;

public class T344_reverseString {
	/**反转字符串
	 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
	 */
    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
			char e=s[i];
			s[i]=s[s.length-1-i];
			s[s.length-1-i]=e;
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a={'h','e','l','l','o'};
		reverseString(a);
		System.out.println(a);
	}

}
