package easy.HashTable;

import java.util.*;

/**
 * Created by whtis on 2017/5/30.
 */
public class E599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> res = new HashSet<>();
        int sum = list1.length + list2.length;
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            String s = list2[i];
            if (map.containsKey(s)) {
                int val = map.get(s);
                map.put(s, -(val + i));
                sum = sum > val + i ? val + i : sum;
            }
        }
        Set<String> set = map.keySet();
        for (String s : set) {
            if (Objects.equals(map.get(s), -sum)) {
                res.add(s);
            }
        }
        return res.toArray(new String[0]);
    }
}
