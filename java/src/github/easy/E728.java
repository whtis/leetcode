package easy;

import java.util.*;

/**
 * Created by whtis on 18-1-28.
 */
public class E728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> results = new ArrayList<>();
        while (left <= right) {
            if (left == 0 || left % 10 == 0) {
                left++;
                continue;
            }

            if (checkSDN(left)) results.add(left);

            left++;
        }
        return results;
    }

    private boolean checkSDN(int left) {
        String nStr = String.valueOf(left);
        for (int i = 0; i < nStr.length(); i++) {
            int target = Integer.parseInt(String.valueOf(nStr.charAt(i)));
            if (target == 0 || left % target != 0) {
                return false;
            }
        }
        return true;
    }
}
