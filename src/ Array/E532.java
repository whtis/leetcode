import java.util.*;

/**
 * Created by wht on 2017/5/1.
 */
public class E532 {
    /* self solution
    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        Map map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            if (list.contains(temp + k) && (int) list.indexOf(temp + k) != i) {
                map.put(temp, temp + k);
            }
        }
        return map.size();
    }
    */

    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            Integer temp = map.getOrDefault(i, 0) + 1;
            map.put(i, temp);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }

        return count;
    }
}
