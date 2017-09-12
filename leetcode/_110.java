package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _110 {
    public boolean isBalanced(TreeNode root) {
        return foo(root) >= 0;
    }

    public int foo(TreeNode root) {
        if(root == null) return 0;
        int v1 = foo(root.left);
        int v2 = foo(root.right);
        if(v1 < 0 || v2 < 0 || Math.abs(v1 - v2) > 1) return -1;
        return Math.max(v1, v2) + 1;
    }
}
