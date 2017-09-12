package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xyq on 2017/9/12.
 */
public class _113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        hasPathSum(root, sum, new ArrayList<Integer>());
        return list;
    }

    public void hasPathSum(TreeNode root, int sum, List<Integer> res) {
        if(root == null) return;
        res.add(root.val);
        if(root.left == null && root.right == null && root.val == sum) {
            list.add(res);
        }
        hasPathSum(root.left, sum - root.val, new ArrayList<Integer>(res));
        hasPathSum(root.right, sum - root.val, new ArrayList<Integer>(res));
    }

    private List<List<Integer>> list = new ArrayList<>();
}

