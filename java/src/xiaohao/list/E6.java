package com.whtis.practise.likou.xiaohao.list;


import java.util.Arrays;

/**
 * @author wuhaitao
 * @date 2020-09-21 9:26 上午
 * @description:
 **/

public class E6 {
	public static String convert(String s, int numRows) {
		String[] arr = new String[numRows];
		int period = 2 * numRows - 2;
		char[] chars = s.toCharArray();
		Arrays.fill(arr, "");
		for (int i = 0; i < chars.length; i++) {
			int temp = i % period;
			if (temp < arr.length) {
				arr[temp] += chars[i];
			} else {
				arr[period - temp] += chars[i];
			}
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (String value : arr) {
			stringBuilder.append(value);
		}
		return stringBuilder.toString();
	}
}
