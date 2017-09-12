package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _344 {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = chars.length - 1; i >= 0; i --) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

}
