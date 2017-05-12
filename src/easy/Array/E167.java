package easy.Array;

/**
 * Created by whtis on 2017/5/12.
 */
public class E167 {
    public int[] twoSum(int[] numbers, int target) {
        //既然排序，先二分法找范围，然后遍历小范围
        int mid = numbers.length / 2;
        int left = 0;
        int right = numbers.length - 1;
        while (numbers[right] > target) {
            right = mid;
            mid = (left + right) / 2;
        }
        int k = 0;
        return new int[0];
    }

}
