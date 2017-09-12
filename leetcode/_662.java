package leetcode;

import java.util.LinkedList;

/**
 * Created by xyq on 2017/9/12.
 */
public class _662 {
    public int widthOfBinaryTree(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList();
        q.addFirst(root);
        foo(q);
        return res;
    }

    private void foo(LinkedList<TreeNode> q) {
        LinkedList<TreeNode> tmp = new LinkedList();
        if(q.size() > res) res = q.size();
        for(TreeNode t : q) {
            if(t == null) t = new TreeNode(0);
            tmp.addLast(t.left);
            tmp.addLast(t.right);
        }
        while(tmp.size() > 0 && tmp.getFirst() == null) {tmp.removeFirst();}
        while(tmp.size() > 0 && tmp.getLast() == null) {tmp.removeLast();}
        if(tmp.size() > 0) foo(tmp);
    }

    private int res = Integer.MIN_VALUE;
}
