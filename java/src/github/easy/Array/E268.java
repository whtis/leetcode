package easy.Array;

import java.util.Arrays;

/**
 * Created by wht on 2017/4/29.
 */
public class E268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
