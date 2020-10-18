package PrimaryArray;

public class Array11 {
	
    /**旋转矩阵
     * 思路1：先沿对角线对折，再沿中线对折
     * 有时候，尽量去发现规律，思路会更清晰，对应的解法也更优。
     */
	
    public static void rotate(int[][] matrix) {
    	if (matrix.length==0||matrix==null) {
			System.out.println("该矩阵为空！");
		}
    	
    	//先沿对角线对折，即i,j对调(上三角或下三角皆可
    	for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j <=i; j++) {
				int e=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=e;
			}
		}
    	
    	//再沿中线对折，即镜像翻转，每行i不变，j=j.length-j-1,只遍历前半行即可；
    	for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length/2; j++) {
				int e=matrix[i][j];
				matrix[i][j]=matrix[i][matrix[i].length-1-j];
				matrix[i][matrix[i].length-1-j]=e;
			}
		}
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a={{1,2,3},{4,5,6},{7,8,9}};
		rotate(a);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
