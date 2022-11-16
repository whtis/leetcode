package easy.HashTable;

import java.util.*;

/**
 * Created by whtis on 17-7-27.
 */
public class E447 {
    /*
    该题要求在一系列点中找出符合要求的三点组合（i,j,k）。因为是二维数组，所以可用双层循环找到符合要求的点，再对筛选出来的这些点（每次外层循环找到的不
    一定只有三个，也不一定是同一组的）进行排列组合，统计结果。全部循环完成后返回最终结果。
     */

    public int numberOfBoomerangs(int[][] points) {
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                int d = getDistance(points[i], points[j]);
                map.put(d, map.getOrDefault(d, 0) + 1);
            }

            for (int val : map.values()) {
                /*
                组合，val个值里面选2个，加上外循环的数组成三个点，那么计算公式应该是：
                C2..value = 2 * value!/(2!*(value-2)! = value*(value-1)
                 */
                res += val * (val - 1);
            }

            map.clear();
        }
        return res;
    }

    private int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];

        return dx * dx + dy * dy;
    }

}
