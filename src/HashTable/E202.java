package HashTable;

import java.util.*;

/**
 * Created by wht on 2017/5/26.
 */
public class E202 {
    /*
    Runtime Error Line 14: java.lang.StackOverflowError
    找不到会出现这异常，无法AC
     */
    public boolean isHappy(int n) {
        List<Integer> nums = new ArrayList<>();
        if (n < 10) {
            nums.add(n);
        } else {
            nums.add(n % 10);
            int a = n / 10;
            while (a >= 10) {
                nums.add(a % 10);
                a = a / 10;
            }
            nums.add(a % 10);
        }
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += Math.pow(nums.get(i), 2);
        }
        if (sum == 1) return true;
        else return isHappy(sum);
    }
}
