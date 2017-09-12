package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _563 {
    public int findTilt(TreeNode root) {
        foo(root);
        return res;
    }

    private int foo(TreeNode t) {
        if(t == null) return 0;
        int left = foo(t.left), right = foo(t.right);
        res += Math.abs(left - right);
        return left + t.val + right;
    }

    private int res = 0;
}
