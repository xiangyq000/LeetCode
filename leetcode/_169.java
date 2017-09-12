package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _169 {
    public int majorityElement(int[] nums) {
        int cursor = nums[0];
        int count = 0;
        for(int i : nums) {
            if(i == cursor) {
                count ++;
            } else {
                count --;
                if(count < 0) {
                    cursor = i;
                    count = 1;
                }
            }
        }
        return cursor;
    }
}
