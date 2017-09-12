package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xyq on 2017/9/12.
 */
public class _515 {
    public List<Integer> largestValues(TreeNode root) {
        if(root == null) return res;
        List<TreeNode> list = new ArrayList();
        list.add(root);
        foo(list);
        return res;
    }

    private void foo(List<TreeNode> list) {
        res.add(max(list));
        List<TreeNode> tmp = new ArrayList();
        for(TreeNode t : list) {
            if(t.left != null) tmp.add(t.left);
            if(t.right != null) tmp.add(t.right);
        }
        if(tmp.size() > 0) foo(tmp);
    }

    private int max(List<TreeNode> list) {
        int max = Integer.MIN_VALUE;
        for(TreeNode n : list) {
            if(n.val > max) max = n.val;
        }
        return max;
    }

    private List<Integer> res = new ArrayList();
}
