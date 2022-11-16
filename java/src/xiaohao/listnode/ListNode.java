package com.whtis.practise.likou.xiaohao.listnode;

/**
 * @author wuhaitao
 * @date 2020-09-23 9:44 上午
 * @description:
 **/

public class ListNode {
	int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public static ListNode getL1() {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);
        ListNode l3 = new ListNode(1);
//        ListNode l4 = new ListNode(4);
//        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;
//        l5.next = l2;
        return l1;
    }

    public static ListNode getL2() {
        ListNode l1 = new ListNode(1);
//        ListNode l2 = new ListNode(22);
//        ListNode l3 = new ListNode(33);
//        ListNode l4 = new ListNode(44);
//        ListNode l5 = new ListNode(55);
//        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;
        return l1;
    }

}
