package PrimaryAlgorithm.PrimaryArray;

public class T122_maxProfit {
	
	/**
	 * 买股票想要获取最大利润，那么我们首先需要先检查数组中第一个数字，
	 * 也就是说第一天的价格是7，第二天价格是1，很明显我们不会在最贵的时候买股票。
	 * 所以我们最开始在第二天买，也就是价格等于1的时候买，第三天价格变成了5，说明有钱赚了，
	 * 那么就马上卖掉。这时候利润就是=5-1=4
	 * 然后我们在第四天价格等于3的时候买股票，第五天价格等于6，有钱赚，那么就马上卖掉即可。
	 * 这时候利润就是=6-3=3总利润就是4+3=7
	 * 由此我们可以得出结论，当明天的价格比今天的价格贵的时候我们今天买，明天卖，这样能够获取最大利润。
	
	 */
	public static int maxProfit(int[] prices) {
		//判空
		if (prices.length<=1||prices==null) {
			return 0;
		}
		int m=0;
		for (int i = 0; i < prices.length-1; i++) {
			//注意下标越界，这里用length-1
			if (prices[i]<prices[i+1]){
				m+=(prices[i+1]-prices[i]);
			}
		}
		return m;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={7,6,4,3,1};
		int anwser=maxProfit(a);
		System.out.println(anwser);
	}

}
