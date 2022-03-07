package Algorithm.LeetCode.Primary.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class T36_isValidSudoku {

	/**判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
    	数字 1-9 在每一行只能出现一次。
    	数字 1-9 在每一列只能出现一次。
    	数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。

	 * 	思路：
	 * 将问题拆分：行验证,列验证,块验证
	 * 将非‘.’元素存入list，再将list转换为HashSet
	 * 利用HashSet的不重复性，与list比较size
	 * 如果两个集合的size不同，说明存在重复元素，对应验证返回false，全局验证返回false
	 * 如果三个验证全为true，全局验证返回true。
	 */

    public static boolean isValidSudoku(char[][] board) {
    	boolean b4=false;
    	if (board.length==0||board==null) {
    		return b4;
		}

    	boolean b1=false;int b11=0;
    	boolean b2=false;int b22=0;
    	boolean b3=false;int b33=0;

    	ArrayList<Character> listRow;
    	ArrayList<Character> listColumn;
    	ArrayList<Character> listBlock;
    	//行验证
    	for (int i = 0; i < 9; i++) {
    		listRow=new ArrayList<>();
			for (int j = 0; j < 9; j++) {
				if (board[i][j]!='.') {
					listRow.add(board[i][j]);
				}
			}//第i行收录完毕
			//验证重复(HashSet中元素不重复
			Set<Character> s=new HashSet<Character>(listRow);
			if (s.size()!=listRow.size()) {
				return b1;
			}
			if (s.size()==listRow.size()) {
				b11++;
				if (b11==9) {
					b1=true;
				}
			}
		}

    	//列验证
    	for (int i = 0; i < 9; i++) {
    		listColumn=new ArrayList<>();
			for (int j = 0; j < 9; j++) {
				if (board[j][i]!='.') {
					listColumn.add(board[j][i]);
				}//第j列收录完毕
			}//验证重复
			Set<Character> s=new HashSet<Character>(listColumn);
			if (s.size()!=listColumn.size()) {
				return b2;
			}
			if (s.size()==listColumn.size()) {
				b22++;
				if (b22==9) {
					b2=true;
				}
			}
		}

    	//块验证
    	for (int m = 0; m < 7; m+=3) {
			for (int n = 0; n < 7; n+=3) {
		    	listBlock=new ArrayList<>();
		    	for (int i = m; i < m+3; i++) {
					for (int j = n; j < n+3; j++) {
						if (board[i][j]!='.') {
							listBlock.add(board[i][j]);
						}
					}
		    	}//块收录完毕
		    	//验证重复
		    	Set<Character> s=new HashSet<Character>(listBlock);
				if (s.size()!=listBlock.size()) {
					return b3;
				}
				if (s.size()==listBlock.size()) {
					b33++;
					if (b33==9) {
					b3=true;
					}
				}
			}
		}
    	//全局验证
    	if (b1==true&&b2==true&&b3==true) {
			b4=true;
		}

		return b4;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] a={
					{'5','3','.','.','7','.','.','.','.'},
					{'6','.','.','1','9','5','.','.','.'},
					{'.','9','8','.','.','.','.','6','.'},
					{'8','.','.','.','6','.','.','.','3'},
					{'4','.','.','8','.','3','.','.','1'},
					{'7','.','.','.','2','.','.','.','6'},
					{'.','6','.','.','.','.','2','8','.'},
					{'.','.','.','4','1','9','.','.','5'},
					{'.','.','.','.','8','.','.','7','9'}
		};
		boolean b=isValidSudoku(a);
		System.out.println(b);
	}

}
