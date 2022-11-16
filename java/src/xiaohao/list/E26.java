package com.whtis.practise.likou.xiaohao.list;

/**
 * @author wuhaitao
 * @date 2020-09-06 9:57 上午
 * @description:
 **/

public class E26 {
	public static int removeDuplicates(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[count]) {
				nums[++count] = nums[i];
			}
		}
		return count+1;
	}

	public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
		removeDuplicates(nums);
	}
}
