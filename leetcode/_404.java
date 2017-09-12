package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _404 {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }

    public int sumOfLeftLeaves(TreeNode root, boolean isLeft) {
        if(root == null) return 0;
        if(root.left == null && root.right == null && isLeft) return root.val;
        return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
    }
}
