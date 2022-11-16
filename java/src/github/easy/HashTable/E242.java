package easy.HashTable;

/**
 * Created by wht on 2017/5/21.
 */
public class E242 {

    /*TLE
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            t = t.replaceFirst(String.valueOf(s.charAt(i)), "0");
        }
        for (int i = 0; i < t.length(); i++) {
            if (!Objects.equals(t.charAt(i), '0')) {
                return false;
            }
        }
        return true;
    }
    */

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] res = new int[26];
        for (int i = 0; i < s.length(); i++) {
            res[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            res[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] != 0) {
                return false;
            }
        }
        return true;
    }


}
