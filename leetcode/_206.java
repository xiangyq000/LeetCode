package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null, cur = head;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
