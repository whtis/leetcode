package medium;

import java.util.*;

/**
 * Created by ht on 2016/3/24.
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s1 = "cdd";
        String s2 = "abcabcbb";
        //// TODO: 2016/5/6
        String s3 = "dvdf";
//        int i = lengthOfLongestSubstring(s1);
        int j = lengthOfLongestSubstring(s2);
//        int k = lengthOfLongestSubstring(s3);
        int a = 0;
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int firstPoint = 0;
        int secPoint = 0;
        int len = 0;
        int max = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            firstPoint = i;
            if (map.containsKey(c)) {
                Integer index = map.get(c);
                if (secPoint <= index) {
                    secPoint = index + 1;
                }
                if (i > index) {
                    map.replace(c, i);
                }
            } else {
                map.put(c, i);
            }
            max = firstPoint - secPoint + 1;
            if (max > len) {
                len = max;
            }

        }
        return len;
    }
}
