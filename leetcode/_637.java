package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xyq on 2017/9/12.
 */
public class _637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<TreeNode> list = new ArrayList();
        list.add(root);
        foo(list);
        return res;
    }

    private void foo(List<TreeNode> list) {
        double sum = 0;
        List<TreeNode> tmp = new ArrayList();
        for(TreeNode node : list) {
            sum += node.val;
            if(node.left != null) tmp.add(node.left);
            if(node.right != null) tmp.add(node.right);
        }
        res.add(sum / list.size());
        if(tmp.size() != 0) foo(tmp);
    }

    private List<Double> res = new ArrayList();
}
