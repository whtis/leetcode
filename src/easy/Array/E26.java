package easy.Array;

/**
 * Created by wht on 2017/4/28.
 */
public class E26 {
    public int removeDuplicates(int[] nums) {
        int count = nums.length > 0 ? 1 : 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[count - 1]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
