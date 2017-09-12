package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _543 {
    public int diameterOfBinaryTree(TreeNode root) {
        return root == null ? 0 : foo(root)[1] - 1;
    }

    public int[] foo(TreeNode root) {
        if(root == null) return new int[]{0, 0};
        int[] left = foo(root.left), right = foo(root.right);
        return new int[]{Integer.max(left[0], right[0]) + 1, max(left[1], right[1], left[0] + right[0] + 1)};
    }

    public int max(int a, int b, int c) {
        return Integer.max(a, Integer.max(b, c));
    }
}
