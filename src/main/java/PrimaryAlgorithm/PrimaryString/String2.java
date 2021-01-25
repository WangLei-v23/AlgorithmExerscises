package PrimaryAlgorithm.PrimaryString;

public class String2 {
	/**整数反转（反转后的数如果溢出（int的表示范围）需要另外处理
	 * 
	 * 要点1：如何将int类型转换为char[]类型？
	 * int a=123; 
	 * String b=String.valueOf(a);
	 * char[] c=b.toCharArray();
	 * 
	 * 要点2：如何将char[]类型转换为int类型？
	 * String b=String.valueOf(c);
	 * int a=Integer.valueOf
	 * 
	 * 要点3：如何表示int类型的最大(小)值？
	 * Integer.MAX_VALUE;
	 * Integer.MIN_VALUE;
	 * 
	 * 要点4：java.lang.NumberFormatException For input String: “9646324351”
	 * int e=Integer.parseInt(st2);
	 * 如果st2转换之后的长度超过int类型的存储范围， 就会报错。
	 * 可以考虑先转换为long类型，判断是否溢出int的范围
	 * 也可以一旦转换报错(即溢出)，直接抛出异常。
	 */
	
	public static int reverse(int a){
		if (a>Integer.MAX_VALUE||a<Integer.MIN_VALUE) {
			return 0;
		}
		int b=1;
		String st1=String.valueOf(a);
		char[] d=st1.toCharArray();
		if (d[0]=='-') {
			for (int i = 1; i < (d.length)/2+1; i++) {
				char f=d[i];
				d[i]=d[d.length-i];
				d[d.length-i]=f;
			}
		}
		if(d[0]!='-'){
			for (int i = 0; i <(d.length)/2; i++) {
				char f=d[i];
				d[i]=d[d.length-1-i];
				d[d.length-1-i]=f;
			}
		}
		String st2=String.valueOf(d);
		try {
			int e=Integer.parseInt(st2);
			if (e>Integer.MAX_VALUE||e<Integer.MIN_VALUE) {
				b=0;
			}
			return e;
		} catch (Exception e) {
			return 0;
		}

		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1534236469;
		int b=reverse(a);
		System.out.println(b);


	}

}
