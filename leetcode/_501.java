package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xyq on 2017/9/12.
 */
public class _501 {
    public int[] findMode(TreeNode root) {
        List<Integer> list = sort(root);
        Map<Integer, Integer> map = new HashMap();
        int max = 0;
        for(Integer i : list) {
            Integer count = map.get(i);
            if(map.get(i) == null) {
                count = 1;
            } else {
                count ++;
            }
            map.put(i, count);
            if(count > max) max = count;
        }
        List<Integer> res = new ArrayList();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == max) {
                res.add(entry.getKey());
            }
        }

        int[] arr = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }

    private List<Integer> sort(TreeNode t) {
        if(t == null) return new ArrayList<Integer>();
        List<Integer> res = sort(t.left);
        res.add(t.val);
        res.addAll(sort(t.right));
        return res;
    }
}
