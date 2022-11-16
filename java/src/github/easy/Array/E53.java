package easy.Array;

/**
 * Created by wht on 2017/5/3.
 */
public class E53 {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {

            max = nums[i] + (max >= 0 ? max : 0);
            sum = Math.max(sum, max);
            /* 下面部分是上面两行的解释
            if (max >= 0) {
                int temp = max;
                max += nums[i];
                if (temp > max) {
                    sum = Math.max(sum, temp);
                } else {
                    sum = Math.max(sum, max);
                }
            } else {
                max = nums[i];
                sum = Math.max(sum, max);
            }
        */
        }
        return sum;
    }
}
