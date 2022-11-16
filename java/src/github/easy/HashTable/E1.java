package easy.HashTable;

import java.util.*;

/**
 * Created by wht on 2017/5/16.
 */
public class E1 {

    /*TLE
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hashTable = new Hashtable<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            hashTable.put(i, nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (hashTable.containsValue(temp)) {
                Set set = hashTable.entrySet();
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) iterator.next();
                    if (entry.getValue().equals(temp)) {
                        int a = (int) entry.getKey();
                        if (i != a) {
                            return new int[]{i, a};
                        }
                    }
                }
            }
        }
        return new int[]{};
    }
    */

    public int[] twoSum(int[] nums, int target) {
        Hashtable hashtable = new Hashtable(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(nums[i])) {
                return new int[]{(int) hashtable.get(nums[i]), i};
            } else {
                hashtable.put(target - nums[i], i);
            }
        }
        return new int[2];
    }
}
