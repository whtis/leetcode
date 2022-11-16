package com.whtis.practise.likou.xiaohao.list;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wuhaitao
 * @date 2020-09-15 10:01 上午
 * @description:
 **/

public class E1 {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int temp = target - nums[i];
			if (map.get(temp) != null) {
				result[0] = map.get(temp);
				result[1] = i;
				break;
			}
			map.put(nums[i], i);

		}
		return result;
	}
}
