package com.whtis.practise.likou.xiaohao.listnode;

/**
 * @author wuhaitao
 * @date 2020-11-23 10:10 上午
 * @description:
 **/
public class E141 {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode h1 = head;
        ListNode h2 = head.next;
        while (h1 != null && h2 != null) {
            if (h2.next == null) {
                return false;
            }
            h2 = h2.next.next;
            if (h1 == h2) {
                return true;
            }
            h1 = h1.next;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(hasCycle(ListNode.getL1()));
    }
}
