package com.whtis.practise.likou.xiaohao.list;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author wuhaitao
 * @date 2020-08-10 10:08 上午
 * @description:
 **/

public class E350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
                continue;
            }
            if (nums1[i] > nums2[j]) {
                j++;
                continue;
            }
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
                continue;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        E350 solution = new E350();
        solution.intersect(nums1, nums2);
        int a = 0;
    }

}