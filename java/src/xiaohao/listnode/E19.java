package com.whtis.practise.likou.xiaohao.listnode;

/**
 * @author wuhaitao
 * @date 2020-09-23 9:44 上午
 * @description:
 **/

public class E19 {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		removeNthFromEnd(l1, 2);
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode pre = new ListNode(0);
		pre.next = head;
		ListNode result = pre;
		ListNode cur = pre;
		int i = 0;
		while (cur.next != null) {
			if (i > n) {
				result = result.next;
			}
			cur = cur.next;
			i++;
		}
		result.next = result.next.next;
		return pre.next;
	}
}
