package easy.Array;

import java.util.*;

/**
 * Created by wht on 2017/3/10.
 */
public class E118 {

    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> n = new ArrayList<List<Integer>>();
//        for (int i = 0; i <= numRows - 1; i++) {
//            List<Integer> m = new ArrayList<Integer>();
// 使用阶乘会超出int范围，不适用
//            for (int j = 0; j <= i; j++) {
//                int c = factorial(i) / (factorial(j) * factorial(i - j));
//                int c = (contiMuilt(i, j + 1)) / factorial(j);
//                m.add(c);
//
//
//            }
//            n.add(m);
//        }

        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++)
                row.set(j, row.get(j) + row.get(j + 1));
            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;

    }

    //使用阶乘当达到15时会超出integer的范围，不适用
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * 计算从一个数到另一个数之间的连续乘法
     *
     * @return
     * @param start
     * @param end
     * start > end
     */
    public int contiMuilt(int start, int end) {
        int sum = 1;
        while (start > end) {
            sum *= start;
            start--;
        }
        return sum;
    }
}
