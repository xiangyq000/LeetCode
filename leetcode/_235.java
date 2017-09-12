package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val > q.val) {
            TreeNode tmp = q;
            q = p;
            p = tmp;
        }
        if(p == root || q == root || (p.val < root.val && q.val > root.val)) return root;
        return q.val < root.val ? lowestCommonAncestor(root.left, p, q) : lowestCommonAncestor(root.right, p, q);
    }
}
