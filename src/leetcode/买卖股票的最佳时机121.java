package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-02-28 18:44
 * @Description: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 **/
public class 买卖股票的最佳时机121 {
	public int maxProfit(int[] prices) {
		if (prices.length==0){
			return 0;
		}
		int[] min = new int[prices.length];
		min[0] = prices[0];
		for(int i=1;i<prices.length;i++){
			if(prices[i]>min[i-1]){
				min[i] = min[i-1];
			}else {
				min[i] = prices[i];
			}
		}
		int tag =0;
		for(int i=0;i<prices.length;i++){
			if(tag < prices[i]-min[i]){
				tag = prices[i]-min[i];
			}
		}
		return tag;
	}
}
