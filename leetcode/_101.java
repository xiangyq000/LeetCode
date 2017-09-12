package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return true;
        if(t1 == null && t2 != null || t1 != null && t2 == null) return false;
        return t1.val == t2.val && isSymmetric(t1.left, t2.right) && isSymmetric(t1.right, t2.left);
    }
}
