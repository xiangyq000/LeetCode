package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return foo(l1, l2, 0);
    }

    public ListNode foo(ListNode l1, ListNode l2, int in) {
        if(l1 == null && l2 == null && in == 0) {
            return null;
        }
        l1 = (l1 == null) ? new ListNode(0) : l1;
        l2 = (l2 == null) ? new ListNode(0) : l2;
        int sum = l1.val + l2.val + in;
        ListNode node = new ListNode(sum % 10);
        node.next = foo(l1.next, l2.next, sum / 10);
        return node;
    }
}
