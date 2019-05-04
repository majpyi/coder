package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-02-25 19:46
 * @Description: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/
 **/
public class 买卖股票的最佳时机II122 {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int start = 0;
        int tag = 0;
        int i = 1;
        if (prices.length <= 1) {
            return 0;
        }
        if (prices[0] > prices[1]) {
            tag = 1;
            start = prices[1];
            i = 2;
        }
        for (; i < prices.length; i++) {
            if (prices[i - 1] < prices[i] && tag == 0) {
                tag = 1;
                start = prices[i - 1];
            } else if (prices[i - 1] > prices[i] && tag == 1) {
                tag = 0;
                sum += (prices[i - 1] - start);
            }
            if (i == prices.length - 1 && prices[i - 1] <= prices[i] && tag == 1) {
                sum += (prices[i] - start);
            }
        }
        return sum;
    }
}
