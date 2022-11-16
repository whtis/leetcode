package com.whtis.practise.likou.xiaohao.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wuhaitao
 * @date 2020-09-17 9:45 上午
 * @description:
 **/

public class E15 {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				break;
			}
			int target = -nums[i];
			int l = i + 1;
			int r = nums.length - 1;
			if (i == 0 || nums[i] != nums[i - 1]) {
				while (l < r) {
					if (nums[l] + nums[r] == target) {
						result.add(Arrays.asList(nums[i], nums[l], nums[r]));
						while (l < r && nums[l] == nums[l + 1]) {
							l++;
						}
						while (l < r && nums[r] == nums[r - 1]) {
							r--;
						}
						l++;
						r--;
					} else if (nums[l] + nums[r] < target) {
						while (l < r && nums[l] == nums[l + 1]) {
							l++;
						}
						l++;
					} else {
						while (l < r && nums[r] == nums[r - 1]) {
							r--;
						}
						r--;
					}
				}
			}
		}
		return result;
	}

}
