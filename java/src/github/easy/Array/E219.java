package easy.Array;

import java.util.*;

/**
 * Created by wht on 2017/4/29.
 */
public class E219 {
    /* TLE
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && j - i <= k) {
                    return true;
                }
            }
        }
        return false;
    }
    */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) set.remove(nums[k - i - 1]);
            if (!set.add(nums[i])) return true;
        }
        return false;
    }
}
