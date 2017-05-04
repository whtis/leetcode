/**
 * Created by wht on 2017/5/3.
 */
public class E53 {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max += nums[i];
            if (temp > max) {
                sum = Math.max(sum, temp);
                max = 0;
            }
        }
        return sum;
    }
}
