package SwordRefersToffer;

public class T1 {
	
	/**二维数组中查找
	 * 在一个二维数组中（每个一维数组的长度相同），
	 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
	 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
	 * 
	 * 思路1:挨个查找（通过）
	 * 思路2：矩阵是有序的，从左下角来看，向上数字递减，向右数字递增，
	 *  因此从左下角开始查找，当要查找数字比左下角数字大时。右移
	 *  要查找数字比左下角数字小时，上移
	 * 思路3：从左上角开始找，向下向右数字递增，小时下移，大时右移
	 * 思路4：按行查找，其中每行二分查找
	 *  注意！：二维数组双重判空
	 */
	
	
	public static boolean Find(int target, int [][] array) {
		if (array==null||array.length==0) {
			return false;
		}
		
		boolean b=false;
		//思路1
//		for (int i = 0; i < array.length; i++) {
//			
//				for (int j = 0; j < array[i].length; j++) {
//					if (array[i][j]==target) {
//						b=true;
//					}
//				}
//			
//		}
		
		//思路2
		for (int i = array.length-1; i>=0; i--) {
			//二维数组双重判空
			if (array[i]==null||array[i].length==0) {
				return false;
			}
			if (array[i][0]>target) {
				continue;
			}
			
			if (array[i][0]==target) {
				b=true;
			}
			
			if (array[i][0]<target) {
				for (int j = 1; j < array[i].length; j++) {
					if (array[i][j]==target) {
						b=true;
					}
				}
			}
			
		
	}
		return b;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [][] a={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
//		int t=1;
//		boolean b=Find(t, a);
//		System.out.println(b);

	}

}
