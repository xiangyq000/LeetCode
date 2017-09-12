package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xyq on 2017/9/12.
 */
public class _513 {
    public int findBottomLeftValue(TreeNode root) {
        List<TreeNode> list = new ArrayList();
        list.add(root);
        foo(list);
        return res;
    }

    private void foo(List<TreeNode> list) {
        List<TreeNode> s = new ArrayList();
        for(TreeNode node : list) {
            if(node.left != null) s.add(node.left);
            if(node.right != null) s.add(node.right);
        }
        if(s.size() == 0) {
            res = list.get(0).val;
        } else {
            foo(s);
        }
    }

    private int res;
}
