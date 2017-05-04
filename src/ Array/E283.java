/**
 * Created by wht on 2017/4/28.
 */
public class E283 {
    /*

    public void moveZeroes(int[] nums) {

        if (nums.length == 0) {
            return;
        }

        int notZeroCount = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[notZeroCount++] = num;
            }
        }
        while (notZeroCount < nums.length) {
            nums[notZeroCount++] = 0;
        }
    }
    */

    public void moveZeroes(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
