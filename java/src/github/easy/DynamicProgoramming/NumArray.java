package easy.DynamicProgoramming;

/**
 * Created by wht on 2017/7/29.
 */

/*
leetcode E303
该题重点是sumRange会被多次调用，因此如果按照通常的想法在每次调用时进行加和运算，会导致算法LTE
最好的方式是提前算好所有数之间的和，并存在一个数组中，返回时只需要简单查找即可

需要注意的是加和的操作和取数时的范围是前后都包含
 */
public class NumArray {

    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) return nums[j];
        return nums[j] - nums[i - 1];
    }
}
