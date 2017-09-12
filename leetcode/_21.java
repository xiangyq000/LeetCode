package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cursor1 = l1, cursor2 = l2;
        ListNode head = new ListNode(0), cur = head;
        while(true) {
            if(cursor1 == null) {
                cur.next = cursor2;
                break;
            }
            if(cursor2 == null) {
                cur.next = cursor1;
                break;
            }
            if(cursor1.val < cursor2.val) {
                cur.next = cursor1;
                cursor1 = cursor1.next;
            } else {
                cur.next = cursor2;
                cursor2 = cursor2.next;
            }
            cur = cur.next;
        }
        return head.next;
    }

}
