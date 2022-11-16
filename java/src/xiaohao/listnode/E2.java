package com.whtis.practise.likou.xiaohao.listnode;

/**
 * @author wuhaitao
 * @date 2020-11-30 9:59 上午
 * @description:
 **/
public class E2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode listNode = result;
        while (l1 != null || l2 != null || carry > 0) {
            int temp = carry;
            if (l1 != null) {
                temp += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                temp += l2.val;
                l2 = l2.next;
            }
            if (temp >= 10) {
                result.next = new ListNode(temp % 10);
                carry = 1;
            } else {
                result.next = new ListNode(temp);
                carry = 0;
            }
            result = result.next;
        }
        return listNode.next;
    }
}
