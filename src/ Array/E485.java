/**
 * Created by wht on 2017/4/27.
 */
public class E485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 1) {
            if (nums[0] == 1)return 1;
            else return 0;
        }
        int temp = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (max < temp) {
                    max = temp;
                }
                temp = 0;
                continue;
            }
            temp++;
        }
        return max > temp ? max : temp;
    }
}
