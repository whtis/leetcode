package HashTable;

import java.util.*;

/**
 * Created by wht on 2017/5/21.
 */
public class E136 {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }

    /*
    XOR operation
    int singleNumber(int A[], int n) {
    int result = 0;
    for (int i = 0; i<n; i++)
      {
		result ^=A[i];
      }
	return result;
   }
     */
}
