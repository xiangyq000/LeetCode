package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p0 = new ListNode(0), p1 = p0, p2 = p0;
        p0.next = head;
        while(n-- > 0) p1 = p1.next;
        while(p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;
        return p0.next;
    }
}
