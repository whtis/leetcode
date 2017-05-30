package easy.HashTable;

/**
 * Created by wht on 2017/5/26.
 */
public class E202 {
    /*
    Runtime Error Line 14: java.lang.StackOverflowError
    找不到会出现这异常，无法AC
    ！！！如果找不到，那必然会出现重复，因此可以修复此方法
     */
//    public boolean isHappy(int n) {
//
//        HashSet set = new HashSet();
//        int sum = check(n);
//        while (set.add(sum)) {
//            if (sum == 1) return true;
//            sum = check(sum);
//        }
//        return false;
//    }
//
//    private int check(int n) {
//        List<Integer> nums = new ArrayList<>();
//        if (n < 10) {
//            nums.add(n);
//        } else {
//            nums.add(n % 10);
//            int a = n / 10;
//            while (a >= 10) {
//                nums.add(a % 10);
//                a = a / 10;
//            }
//            nums.add(a % 10);
//        }
//        int sum = 0;
//        for (int i = 0; i < nums.size(); i++) {
//            sum += Math.pow(nums.get(i), 2);
//        }
//        return sum;
//    }

    /*
    这种解法的巧妙在于，对一个循环链表进行遍历，slow逐一遍历，fast可以间隔一个进行遍历，最终slow都会追上fast（可能这时候的fast已经比slow多循环了几次，但最终都会相等）
    本题题设是如果存在的话，slow就会为1且一直停止在1这个位置，fast也会最终循环到1，如果不存在，fast追上slow的时候至少循环了一遍，而这遍循环中不存在1，所以可以返回true
     */
    public boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        } while (slow != fast);
        if (slow == 1) return true;
        else return false;
    }

    private int digitSquareSum(int n) {
        int sum = 0, tmp;
        while (n != 0) {
            tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }
}