package com.whtis.practise.likou.xiaohao.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuhaitao
 * @date 2020-09-06 9:41 上午
 * @description:
 **/

public class E27 {

    public int removeElement(int[] nums, int val) {
        List<Integer> indexs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                indexs.add(nums[i]);
            }
        }
        for (int i = 0; i < indexs.size(); i++) {
            nums[i] = indexs.get(i);
        }
        return indexs.size();
    }
}
