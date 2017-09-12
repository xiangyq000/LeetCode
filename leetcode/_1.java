package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xyq on 2017/9/12.
 */
public class _1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            if(map.containsKey(j) && i != map.get(j)) {
                return new int[]{i, map.get(j)};
            }
        }
        return null;
    }
}
