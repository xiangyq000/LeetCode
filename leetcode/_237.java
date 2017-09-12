package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _237 {
    public void deleteNode(ListNode node) {
        ListNode p = node;
        while(p.next.next != null) {
            p.val = p.next.val;
            p = p.next;
        }
        p.val = p.next.val;
        p.next = null;
    }
}
