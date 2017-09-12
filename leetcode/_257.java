package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xyq on 2017/9/12.
 */
public class _257 {
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return list;
        foo(root, "");
        return list;
    }

    public void foo(TreeNode root, String pre) {
        pre = "".equals(pre) ? pre + root.val : pre + "->" + root.val;
        if(root.left == null && root.right == null) list.add(pre);
        if(root.left != null) foo(root.left, pre);
        if(root.right != null) foo(root.right, pre);
    }

    private List<String> list = new ArrayList();
}
