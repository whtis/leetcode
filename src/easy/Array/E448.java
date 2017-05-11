import java.util.*;

/**
 * Created by wht on 2017/4/28.
 */
public class E448 {
    /*
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            list.add(i + 1);
        }
        for (int num : nums) {
            if (list.contains(num)) {
                // 当remove num时，默认时移除num所在的index
                list.remove(new Integer(num));
            }
        }
        return list;
    }
    */

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();

        //取负规则决定了最后返回的值
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int val = length - Math.abs(nums[i]);
            if (nums[val] > 0) {
                nums[val] = -Math.abs(nums[val]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(length - i);
            }
        }
        Collections.sort(list);
        return list;
    }
}
