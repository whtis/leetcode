package HashTable;

import java.util.*;

/**
 * Created by wht on 2017/5/16.
 */
public class E409 {
    public int longestPalindrome(String s) {
        if (s.length() == 0) return 0;
        HashSet<Character> hashSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hashSet.contains(s.charAt(i))) {
                hashSet.remove(s.charAt(i));
                count++;
            } else hashSet.add(s.charAt(i));
        }
        if (!hashSet.isEmpty()) return count * 2 + 1;
        return count * 2;
    }
}
