import java.util.Arrays;

/**
 * Created by wht on 2017/4/29.
 */
public class E217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) return false;
        Arrays.sort(nums);
        int index = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == index) return true;
            index = nums[i];
        }
        return false;
    }
}
