package com.whtis.practise.likou.xiaohao.dp;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author wuhaitao
 * @date 2020-12-21 10:10 上午
 * @description: 最长递增子序列长度
 **/
public class E300 {

    public static int lengthOfLIS(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> dpList = new ArrayList<>();
        dpList.add(0, 1);
        for (int i = 1; i < nums.length; i++) {
            List<Integer> sublist = list.subList(0, i + 1);
            dpList.add(calculateDpi(sublist, dpList));
        }
        return dpList.stream().max(Comparator.naturalOrder()).get();

    }

    public static int calculateDpi(List<Integer> sublist, List<Integer> dpList) {
        int current = sublist.get(sublist.size() - 1);
        int result = 0;
        for (int i = 0; i < sublist.size() - 1; i++) {
            if (sublist.get(i) < current) {
                result = Math.max(result, dpList.get(i));
            }
        }
        return result == 0 ? 1 : result + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{10, 1, 2, 3, 6, 4};
        System.out.println(lengthOfLIS(nums));
    }

}
