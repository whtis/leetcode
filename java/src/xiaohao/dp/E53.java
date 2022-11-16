package com.whtis.practise.likou.xiaohao.dp;

/**
 * @author wuhaitao
 * @date 2020-12-21 10:03 上午
 * @description: 最大连续子序列
 **/
public class E53 {

    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int dp0 = nums[0];
        int result = dp0;
        for (int i = 1; i < nums.length; i++) {
            dp0 = Math.max(dp0 + nums[i], nums[i]);
            result = Math.max(result, dp0);
        }
        return result;
    }

}
