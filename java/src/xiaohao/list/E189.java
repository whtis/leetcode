package com.whtis.practise.likou.xiaohao.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wuhaitao
 * @date 2020-08-27 9:53 上午
 * @description:
 **/

public class E189 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums, 3);
    }

    public static void rotate(int[] nums, int k) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.rotate(list, k);
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
    }
}
