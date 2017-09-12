package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _231 {
    public boolean isPowerOfTwo(int n) {
        return n <= 0 ? false : (n & n-1) == 0;
    }
}
