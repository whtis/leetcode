import java.util.*;

/**
 * Created by whtis on 18-1-29.
 */
public class E771 {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) count++;
        }
        return count;
    }
}
