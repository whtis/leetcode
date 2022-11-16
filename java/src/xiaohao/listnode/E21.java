package com.whtis.practise.likou.xiaohao.listnode;

/**
 * @author wuhaitao
 * @date 2020-10-27 10:07 上午
 * @description:
 **/

public class E21 {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode pre = new ListNode(0);
		ListNode result = pre;
		while (l1 != null && l2 != null) {
			if (l1.val >= l2.val) {
				pre.next = l2;
				l2 = l2.next;
			} else {
				pre.next = l1;
				l1 = l1.next;
			}
			pre = pre.next;
		}
		if (l1 != null) {
			pre.next = l1;
		}
		if (l2 != null) {
			pre.next = l2;
		}
		return result;
	}

	public static void main(String[] args) {
 		mergeTwoLists(ListNode.getL2(), ListNode.getL2());
	}

}
