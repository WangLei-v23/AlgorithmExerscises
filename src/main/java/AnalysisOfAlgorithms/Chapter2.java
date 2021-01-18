package AnalysisOfAlgorithms;

public class Chapter2 {
	
	/**数组的全排列
	 * 思路:递归
	 * ABCD的全排列可以是
	 * A+BCD的全排列
	 * (BCD的全排列是:
	 * B+CD的全排列,C+BD的全排列,D+CB的全排列)
	 * ....以此类推
	 * 简单说,先确定第一位的字符,剩下的记录继续做全排列
	 * 重复操作是取不同项的首位+其余项的全排列
	 * 递归终止条件是start==end，
	 * 也就是只有一个记录需要做全排列，也就是到了最后一个记录，
	 * 这就是全排列的一种情况，输入本次的记录，也就是数组arr即可
	 * @param arr输入数组
	 * @param start起始位置
	 * @param end终止位置
	 */
	public static void fullSort(int[] arr, int start, int end) {
        // 递归终止条件
        if (start == end) {
            for (int i : arr) {
                System.out.print(i);
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= end; i++) {
            swap(arr, i, start);
            fullSort(arr, start + 1, end);
            swap(arr, i, start);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    
    /**整数划分问题
     */
    public static int q(int n,int m){
    	//若正整数或最大加数小于1，则返回0
    	if(n<1||m<1) return 0;
    	//若正整数或最大加数等于1，则划分个数为1（n个1相加）
    	if(n==1||m==1) return 1;
    	//若最大加数实际上不能大于正整数n
    	//若大于则划分个数等于最大加数为n的划分个数
    	if(n<m) return q(n,n);
    	//若正整数等于最大加数，则划分个数等于
    	if (n==m) return 1+q(n,n-1);
    	return q(n,m-1)+q(n-m,m);
    } 

	public static void main(String[] args) {
		
		//测试递归全排列
      int[] arr = { 1, 2, 3, 4 };
      fullSort(arr, 0, arr.length - 1);

	}

}
