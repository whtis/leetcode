package com.whtis.practise.likou.xiaohao.list;

/**
 * @author wuhaitao
 * @date 2020-08-25 9:52 上午
 * @description:
 **/

public class E122 {
    public static int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int profile = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i -1]) {
                profile += prices[i] - prices[i -1];
            }
        }
        return profile;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(maxProfit(arr));
    }

}
