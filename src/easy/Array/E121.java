package easy.Array;

/**
 * Created by wht on 2017/3/19.
 *
 * kadane Algorithm is best,see https://en.wikipedia.org/wiki/Maximum_subarray_problem
 */
public class E121 {

    public int maxProfit(int[] prices) {
        int temp = prices[0], defference = 0;
        for (int i = 1; i < prices.length; i++) {
            defference = Math.max(defference, prices[i] - temp);
            if (prices[i] < temp) temp = prices[i];
        }
        return defference;
    }
}
