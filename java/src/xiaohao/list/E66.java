package com.whtis.practise.likou.xiaohao.list;

/**
 * @author wuhaitao
 * @date 2020-09-11 10:06 上午
 * @description:
 **/

public class E66 {
	public int[] plusOne(int[] digits) {
		int index = digits.length - 1;
		while (index >= 0) {
			if (digits[index] != 9) {
				digits[index]++;
				return digits;
			}
			digits[index] = 0;
			index--;
		}
		int[] temp = new int[digits.length + 1];
		temp[0] = 1;
		return temp;
	}
}
