package easy.Array;

import java.util.Arrays;

/**
 * Created by wht on 2017/5/15.
 */
public class E581 {
    public int findUnsortedSubarray(int[] nums) {
    /* 搞不懂的算法
        int n = nums.length, beg = -1, end = -2, min = nums[n - 1], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - 1 - i]);
            if (nums[i] < max) end = i;
            if (nums[n - 1 - i] > min) beg = n - 1 - i;
        }
        return end - beg + 1;
    */

        //对整个数组排序进行比较找到不同的字串位置
        int[] newNums = new int[nums.length];
        System.arraycopy(nums, 0, newNums, 0, nums.length);
        Arrays.sort(newNums);

        int left = -1, right = -2;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != newNums[i] && left < 0) {
                left = i;
            }
            if (nums[nums.length - 1 - i] != newNums[nums.length - 1 - i] && right < 0) {
                right = nums.length - 1 - i;
            }
        }

        return right - left + 1;
    }
}
