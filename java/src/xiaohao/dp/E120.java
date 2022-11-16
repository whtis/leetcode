package com.whtis.practise.likou.xiaohao.dp;

import java.util.List;

/**
 * @author wuhaitao
 * @date 2020-12-28 10:02 上午
 * @description: 三角形最小路径和
 **/
public class E120 {

    public static int minimumTotal(List<List<Integer>> triangle) {
        int temp = 0;
        int result = 0;
        for (List<Integer> tr : triangle) {
            if (temp + 1 > tr.size() - 1) {
                result += tr.get(temp);
                continue;
            }
            if (tr.get(temp) > tr.get(temp + 1)) {
                temp = temp + 1;
            }
            result += tr.get(temp);
        }
        return result;
    }

    public static void main(String[] args) {
//        List<List<Integer>> list = new ArrayList<>();
//        list.add(Collections.singletonList(-1));
//        list.add(Arrays.asList(-2, -3));
//        System.out.println(minimumTotal(list));


    }

}
