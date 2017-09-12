package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xyq on 2017/9/12.
 */
public class _653 {
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        List<Integer> list = sort(root);
        int i = 0, j = list.size() - 1;
        while(i < j) {
            int sum = list.get(i) + list.get(j);
            if(sum == k) return true;
            if(sum > k) {
                j --;
            } else {
                i ++;
            }
        }
        return false;
    }

    private List<Integer> sort(TreeNode t) {
        List<Integer> res = t.left != null ? sort(t.left) : new ArrayList();
        res.add(t.val);
        if(t.right != null) res.addAll(sort(t.right));
        return res;
    }
}
