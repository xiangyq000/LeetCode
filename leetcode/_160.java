package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int na = count(headA), nb = count(headB);
        if(na < nb) {
            int dif = nb - na;
            while(dif -- > 0) {
                headB = headB.next;
            }
        } else {
            int dif = na - nb;
            while(dif -- > 0) {
                headA = headA.next;
            }
        }
        while(headA != null) {
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    private int count(ListNode node) {
        int count = 0;
        while(node != null) {
            node = node.next;
            count ++;
        }
        return count;
    }
}
