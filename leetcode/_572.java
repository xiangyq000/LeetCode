package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return equals(s, t) || (s == null ? false : (isSubtree(s.left, t) || isSubtree(s.right, t)));
    }

    private boolean equals(TreeNode s, TreeNode t) {
        if(s == null && t == null) return true;
        if((s == null && t != null) || (s != null & t == null)) return false;
        return s.val == t.val && equals(s.left, t.left) && equals(s.right, t.right);
    }
}
