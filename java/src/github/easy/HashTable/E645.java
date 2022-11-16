package easy.HashTable;

import java.util.*;

/**
 * Created by wht on 2017/7/29.
 */
public class E645 {
    /*
    自己的解法：创建一个完整的set，比对nums找到缺失的和重复的，因为只有一个缺失，一个重复，语法上不会出现错误
     */

//    public int[] findErrorNums(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        int[] res = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            set.add(i + 1);
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            if (set.contains(nums[i])) {
//                set.remove(nums[i]);
//            } else {
//                res[0] = nums[i];
//            }
//        }
//        res[1] = set.iterator().next();
//        return res;
//    }

    /*
    高票答案
     */

    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int duplicate = 0, n = nums.length;
        long sum = (n * (n + 1)) / 2;
        for (int i : nums) {
            if (set.contains(i)) duplicate = i;
            sum -= i;
            set.add(i);
        }
        return new int[]{duplicate, (int) sum + duplicate};
    }
}
