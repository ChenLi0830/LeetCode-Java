/**
 * Created by Chen on 2016-11-26.
 */
public class LeetCode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int digit = 0;
        ListNode preHead = new ListNode(0), prev = preHead;
        while (l1 != null || l2 != null){
            int value = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + digit;
            ListNode node = new ListNode(value % 10);
            digit = value / 10;

            prev.next = node;
            prev = node;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (digit != 0) prev.next = new ListNode(1);
        return preHead.next;
    }
}
