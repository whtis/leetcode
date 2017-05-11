package easy.Array;

/**
 * Created by wht on 2017/5/2.
 */
public class E189 {

    /* TLE
    public void rotate(int[] nums, int k) {
        while (k > 0) {
            int first = nums[0];
            int last = nums[nums.length - 1];
            for (int i = 1; i < nums.length; i++) {
                int a = nums[i];
                nums[i] = first;
                first = a;
            }
            nums[0] = last;
            k--;
        }
    }
    */

    // AC 0ms
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] copyNums = new int[nums.length];
        System.arraycopy(nums, 0, copyNums, 0, nums.length);
        System.arraycopy(copyNums, 0, nums, k, nums.length - k);
        System.arraycopy(copyNums, copyNums.length - k, nums, 0, k);
    }

    /* AC 6ms
    public void rotate(int[] nums, int k) {
        while (k - nums.length >= 0) {
            k = k - nums.length;
        }
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < nums.length - k; i++) {
            l1.add(nums[i]);
        }
        for (int i = nums.length - k; i < nums.length; i++) {
            l2.add(nums[i]);
        }
        l2.addAll(l1);
        for (int i = 0; i < l2.size(); i++) {
            nums[i] = l2.get(i);
        }
    }
    */
}
