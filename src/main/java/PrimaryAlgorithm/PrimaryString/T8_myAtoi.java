package PrimaryAlgorithm.PrimaryString;


public class String6 {
	/**字符串转换整数 (atoi)
	 *要点：严格按照题意写，思路不对赶紧改（一不小心就浪费一天时间
	 *String比较时用equals,char比较时用==
	 *（因为String是引用类型,char是基本类型
	 *返回值越界抛出用try{}catch{}更好
	 *num.substring(0, 1).equals("-")取字符串中指定（起始位置，个数）的字符
	 *eg:
	 *String num="-12345";
	 *String s1=num.substring(0, 4);
	 *s1=-123
	 */
	
    public static int myAtoi(String str) {
//    	if (str.equals("-")||(str.equals(""))) {
//			return 0;
//		}
//    	if (str.equals(null)) {
//			return 0;
//		}
//    	if ((str.contains("-0 "))||(str.contains("+0 "))||(str.contains("+-"))||(str.contains("-+"))) {
//			return 0;
//		}
//    	if ((str.contains("- "))||(str.contains("+ "))) {
//			return 0;
//		}
//    	if ((str.contains("0-"))||(str.contains("0+"))) {
//			return 0;
//		}
//    	String st=str.replace("+", "");
//    	String str1=st.replace(" ", "");
//    	if ((str1.equals(""))||(str1.equals("-"))) {
//			return 0;
//		}
//    	System.out.println("str1="+str1);
//    	
//    	
//    	char[] c1=str1.toCharArray();
//    	
//    	String str2="";
//    	int j=0;
//    	int len=c1.length;
//    	boolean b=false;
//   		for (int i = 0; i < c1.length; i++) {
//   			if (c1[0]=='-') {
//				break;
//			}
//   			if (c1[i]=='0') {
//				j++;
//			}else {
//				break;
//			}
//   			
//		}
//   		for (int i = 0; i < c1.length; i++) {
//			if (c1[i]=='-') {
//				b=true;
//			}
//		}
//   		
//   		if (b) {
//   			if ((c1[0]=='-')&&(c1[1]=='0')) {
//   				String ss="";
//				ss+=c1[0];
//				int i=1;
//				for (; i < c1.length;) {
//					if (c1[i]=='0') {
//						i++;
//					}else {
//						break;
//					}
//				}
//				for (int k = i; k < c1.length; k++) {
//					ss+=c1[k];
//				}
//				str2=ss;
//   			
//   			}else{
//					for (; j < len; j++) {
//				
//					if ((c1[j]=='-')) {
//						str2+=c1[j];
//						for (int i = j+1; i <len; i++) {
//							if (Character.isDigit(c1[i])) {
//								str2+=c1[i];
//							}else {
//								break;
//							}
//						}break;			
//					}
//				}
//			}
//		}
//   		if (!b) {
//   			for (; j < len; j++) {
//   	    		if ((c1[j]!='-')) {
//   	    			for (int i = j; i <len; i++) {
//   	    				if (Character.isDigit(c1[i])) {
//   	    				str2+=c1[i];
//   	    				}else {
//   	    					break;
//   						}
//   	    			}break;
//   	    			
//   	    		}
//   			}
//		}
//    	
//    	
//    	
//    	if ((str2.equals(""))||(str2.equals("-"))){
//			return 0;
//		}
////    	str2=str2.replaceAll("['-'^a-z^A-Z]","");//去除a-z
//    	char[]c2=str2.toCharArray();
//    	String s3="";
//    	int i=0;
//    	if (c2[0]=='-') {
//			s3+=c2[0];
//			i++;
//		}
//    	for (; i < c2.length; i++) {
//			if (Character.isDigit(c2[i])) {
//				s3+=c2[i];
//			}else {
//				break;
//			}
//		}
//    	char[] c3=s3.toCharArray();
//    	System.out.println("s3"+s3);
//    	if (s3.equals("-")||(s3.equals(""))) {
//			return 0;
//		}
//    	if (c3.length>18) {
//    		if (c3[0]=='-') {
//				return Integer.MIN_VALUE;
//			}
//			return Integer.MAX_VALUE;
//					
//		}
//    	
//    	int re=0;
//    	long l1=Long.valueOf(s3);
//    	if (l1>Integer.MAX_VALUE) {
//			re=Integer.MAX_VALUE;
//		}else if (l1<Integer.MIN_VALUE) {
//			re=Integer.MIN_VALUE;
//		}else {
//			re=(int)l1;
//		}
//		return re;   ||(str==)

    	if ((str.equals(null))||(str.equals(""))) {
			return 0;
		}
        int ret=0;
        char[] c1=str.toCharArray();
        int k=0;
        for (; k < c1.length;) {
			if (c1[k]==' ') {
				k++;
				if (k==c1.length) {
					return 0;
				}
				
			}else {
				break;
			}
			
		}
//      System.out.println("c1="+c1);
        String s1="";
        char sign=' ';
        //开始遍历c1
        for (int i = 0; i < c1.length; i++) {
        	if (c1[i]==' ') {
				continue;
			}
        	//找到第一个非空字符
        	if (c1[i]!=' ') {
				//如果是数字
			 if (Character.isDigit(c1[i])){
					sign=c1[i];
				lab:for (int j =i+1; j < c1.length; j++) {
						if (c1[j]==' ') {
							break;
						}
						if (!Character.isDigit(c1[j])) {
							break;
						}
						if (Character.isDigit(c1[j])) {
							s1+=c1[j];
							continue lab;
						}
					}
					break;
				}
				//如果是符号
				else if ((c1[i]=='+')||(c1[i])=='-') {
				//将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号
					sign=c1[i];
					for (int j =i+1; j < c1.length; j++) {
						if (c1[j]==' ') {
							break;
						}
						if (!Character.isDigit(c1[j])) {
							break;
						}
						if (Character.isDigit(c1[j])) {
							s1+=c1[j];
							
						}
					}
					break;
				}else{
					//字母情况，直接返回0
					return 0;
				}
			}
		}
        
        if ((s1.equals("")||(s1.equals(" ")))&&((sign=='-')||(sign=='+'))) {
			return 0;
		}
        String num="";
        //如果符号是+，需要去掉
        if (sign=='+') {
			num=s1;
		}else {
			num=sign+s1;
		}
        System.out.println("num="+num.toString());
        if (num.equals(" ")) {
			return 0;
		}
        try {
			return Integer.valueOf(num.toString());
		} catch (Exception e) {

			if (num.substring(0, 1).equals("-")) {
				return Integer.MIN_VALUE;
			}else {
				return Integer.MAX_VALUE;
			}
		}
        
//        System.out.println(num);
        //如果超过long的长度，直接返回int的边界值
 
//        char[] c2=num.toCharArray();
//        int l=0;
//        for (; l < c1.length;) {
//			if (c1[l]==' ') {
//				l++;
//				if (l==c1.length) {
//					return 0;
//				}
//				
//			}else {
//				break;
//			}
//			
//		}
//        if (c2.length>18) {
//			if (sign=='-') {
//				return Integer.MIN_VALUE;
//			}else {
//				return Integer.MAX_VALUE;
//			}
//		}else {//没超过long,就用long存起来,看是否超过了int的长度
//			
//			Long l1=Long.parseLong(num);
//			if (l1>Integer.MAX_VALUE) {
//				return Integer.MAX_VALUE;
//			}else if (l1<Integer.MIN_VALUE) {
//				return Integer.MIN_VALUE;
//			}else {//如果在int范围内，赋给ret，返回该值
//				ret=Integer.valueOf(num);
//			}
//		}
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="   0000000000000000000   ";
		int a=myAtoi(str);
		System.out.println("结果="+a);
	}

}
