package com.whtis.practise.likou.xiaohao.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuhaitao
 * @date 2020-12-10 10:04 上午
 * @description: 爬楼梯的方法
 **/
public class E70 {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for (int i = 3; i <=n; i++) {
            list.add(list.get(i - 2)+list.get(i - 3));
        }
        return list.get(list.size() - 1);
    }

}
