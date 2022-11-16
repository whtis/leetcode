package easy.HashTable;

import java.util.*;

/**
 * Created by wht on 2017/5/18.
 */
public class E349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet();
        HashSet<Integer> set2 = new HashSet();
        for (int aNums1 : nums1) {
            set1.add(aNums1);
        }
        for (int aNums2 : nums2) {
            if (set1.contains(aNums2)) {
                set2.add(aNums2);
            }
        }
        Object[] objects = set2.toArray();
        int[] res = new int[objects.length];
        for (int i = 0; i < objects.length; i++) {
            res[i] = (int) objects[i];
        }
        return res;
    }
}
