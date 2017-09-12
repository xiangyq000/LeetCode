package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _116 {
    public void connect(TreeLinkNode root) {
        if(root == null || root.left == null) return;
        root.left.next = root.right;
        root.right.next = root.next == null ? null : root.next.left;
        connect(root.left);
        connect(root.right);
    }
}
