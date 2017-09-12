package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i : nums) {
            res ^= i;
        }
        return res;
    }
}
