package PrimaryAlgorithm.PrimaryString;

public class T28_strStr {
	/**实现 strStr() 函数。
	 * 给定一个 haystack 字符串和一个 needle 字符串，
	 * 在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
	 * 如果不存在，则返回  -1
	 * 

	 * 思路1：手写indexOf();//源码也是二层循环
	 * 先将String s1,s2>>char[] c1,c2 接着遍历比较
	 * 即,从头开始遍历c1,1层循环每遍历一个,2层循环遍历c2.length
	 * 遍历时,比较c1,c2
	 * 如果2层循环可以遍历完,说明c1中存在c2,此时i的位置即为 s2出现的第一个位置,返回i
	 * 如果中间出现c1!=c2的情况,返回1层循环
	 * 如果1层循环遍历完,说明c1中不包含c2,令i=-1
	 * 返回i;


	 * 思路2:直接使用indexOf();返回第一次出现的指定子字符串在此字符串中的索引。 
	    int result =-1;
        if(needle!=""){
        	result = haystack.indexOf(needle);
        }else{
        	result = 0;
        }
        return result;
        
ps.Java中字符串中子串的查找共有四种方法，如下：

1、int indexOf(String str)
返回第一次出现的指定子字符串在此字符串中的索引。 

2、int indexOf(String str, int startIndex)
从指定的索引处开始，返回第一次出现的指定子字符串在此字符串中的索引。 

3、int lastIndexOf(String str)
返回在此字符串中最右边出现的指定子字符串的索引。 

4、int lastIndexOf(String str, int startIndex)
从指定的索引处开始向后搜索，返回在此字符串中最后一次出现的指定子字符串的索引

	 */
	
    public static int strStr(String haystack, String needle) {
    	needle=needle.replaceAll(" ", "");
    	haystack=haystack.replaceAll(" ", "");
    	if (needle.equals("")||haystack.equals(needle)) {
			return 0;
		}
    	if (haystack.equals("")) {
			return -1;
		}
    	char[] c1=haystack.toCharArray();
    	char[] c2=needle.toCharArray();
    	if (c2.length>c1.length) {
			return -1;
		}
    	int i = 0;
    	for ( ;i < c1.length; i++) {
			for (int j = 0; j < c2.length; j++) {
				if (i+j>c1.length-1) {
					return -1;
				}
				if (c1[i+j]==c2[j]) {
					if (j==c2.length-1) {
						return i;
					}
					continue;
				}else {
					break;
				}
			}
		}
    	if (i==c1.length) {
			i=-1;
		}
		return i;
//	    int result =-1;
//        if(needle!=""){
//        	result = haystack.indexOf(needle);
//        }else{
//        	result = 0;
//        }
//        return result;
        
    }

	public static void main(String[] args) {
		/**
		 * "mississippi" "issipi"
		 * "aaaaa" "bba"
		 */
		String haystack = "mississippi";
		String needle = "issip";
		int a=strStr(haystack, needle);
		System.out.println(a);
	}

}
