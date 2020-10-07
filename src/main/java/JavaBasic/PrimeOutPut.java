package JavaBasic;

public class PrimeOutPut {
	/**
	 * 输出k以内的质数个数
	 */
	public static int  Prime(int k) {
		int m=0;
		lab: for (int i = 2; i <=k; i++) {
			for (int j = 2; j <=Math.sqrt(i); j++) {
				if (i%j==0) {
					continue lab;
				}				}
			m++; 
		}	
		
		return m;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Prime(100);
		System.out.println(a);
	}

}
