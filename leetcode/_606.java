package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _606 {
    public String tree2str(TreeNode t) {
    if(t == null) return "";
    if(t.left != null) {
        if(t.right == null) return t.val + "(" + tree2str(t.left) + ')';
        return t.val + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ')';
    } else {
        if(t.right == null) return "" + t.val;
        return t.val + "()(" + tree2str(t.right) + ')';
    }
}
}
