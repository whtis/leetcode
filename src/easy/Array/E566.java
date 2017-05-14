package easy.Array;

import java.util.*;

/**
 * Created by wht on 2017/5/14.
 */
public class E566 {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;
        if (m * n != r * c) {
            return nums;
        }

        List<Integer> ns = new ArrayList<Integer>();
        for (int i = 0; i < m * n; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//                ns.add(nums[i][j]);
//            }
            ns.add(nums[i / n][i % n]);
        }

        int[][] newNums = new int[r][c];
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                newNums[i][j] = ns.get(count++);
            }
        }
        return newNums;
    }


    /* vote top
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length;
        if (r * c != n * m) return nums;
        int[][] res = new int[r][c];
        for (int i = 0; i < r * c; i++)
            res[i / c][i % c] = nums[i / m][i % m];
        return res;
    }
    */
}
