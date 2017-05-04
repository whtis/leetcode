/**
 * Created by wht on 2017/5/1.
 */
public class E122 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int temp = prices[0], deffience = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > temp) {
                deffience += prices[i] - temp;
            }
            temp = prices[i];
        }
        return deffience;
    }
}
