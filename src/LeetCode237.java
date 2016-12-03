/**
 * Created by Chen on 2016-12-02.
 */
public class LeetCode237 {
    public void deleteNode(ListNode node) {
        while (node.next != null && node.next.next != null){
            node.val = node.next.val;
            node = node.next;
        }
        node.val = node.next != null ? node.next.val : 0;
        node.next = null;
    }
}
