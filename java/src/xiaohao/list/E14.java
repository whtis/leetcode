package com.whtis.practise.likou.xiaohao.list;

/**
 * @author wuhaitao
 * @date 2020-08-21 9:54 上午
 * @description:
 **/

public class E14 {

    public static String longestCommonPrefix(String[] strings) {
        if (strings.length == 0) return "";
        String base = strings[0];
        int baseLength = base.length();
        for (int i = 1; i < strings.length; i++) {
            baseLength = Math.min(baseLength, strings[i].length());
            while (baseLength > 0) {
                if (base.substring(0, baseLength).equals(strings[i].substring(0, baseLength))) {
                    break;
                }
                baseLength--;
            }
        }
        if (baseLength == 0) {
            return "";
        }
        return base.substring(0, baseLength);
    }

    public static void main(String[] args) {
        Object o = "3234214231";
        Long a = Long.parseLong((String) o);
        System.out.println(a);
    }
}
