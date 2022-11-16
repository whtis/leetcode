package easy.HashTable;

/**
 * Created by wht on 2017/5/27.
 */
public class E389 {
    public char findTheDifference(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            t = t.replaceFirst(String.valueOf(s.charAt(i)), "");
        }
        return t.charAt(0);
    }
}
