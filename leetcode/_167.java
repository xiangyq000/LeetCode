package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _167 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while(true) {
            int sum = numbers[i] + numbers[j];
            if(sum == target) break;
            if(sum > target) {
                j --;
            } else {
                i ++;
            }
        }
        return new int[]{i + 1, j + 1};
    }
}
