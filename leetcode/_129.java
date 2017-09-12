package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xyq on 2017/9/12.
 */
public class _129 {
    public int sumNumbers(TreeNode root) {
        foo(root, "");
        int sum = 0;
        for(String i : list) {
            sum += Integer.valueOf(i);
        }
        return sum;
    }

    public void foo(TreeNode root, String res) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            res += root.val;
            list.add(res);
        }
        if(root.left != null) foo(root.left, new String(res + root.val));
        if(root.right != null) foo(root.right, new String(res + root.val));
    }

    List<String> list = new ArrayList();
}
