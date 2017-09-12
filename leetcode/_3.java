package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xyq on 2017/9/12.
 */
public class _3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int maxLength = 0, start = 0;
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= start) {
                maxLength = Math.max(maxLength, i - start);
                start = map.get(s.charAt(i)) + 1;
            }
            map.put(s.charAt(i), i);
        }
        return Math.max(maxLength, s.length() - start);
    }
}
