package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by xyq on 2017/9/12.
 */
public class _107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<TreeNode> list = new ArrayList();
        if(root != null) {
            list.add(root);
            foo(list);
        }
        Collections.reverse(res);
        return res;
    }

    private void foo(List<TreeNode> list) {
        List<TreeNode> tmp = new ArrayList();
        List<Integer> nums = new ArrayList();
        for(TreeNode t : list) {
            nums.add(t.val);
            if(t.left != null) tmp.add(t.left);
            if(t.right != null) tmp.add(t.right);
        }
        res.add(nums);
        if(tmp.size() > 0) foo(tmp);
    }

    private List<List<Integer>> res = new ArrayList<List<Integer>>();
}
