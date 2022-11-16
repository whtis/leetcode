package easy.HashTable;

/**
 * Created by wht on 2017/5/21.
 */
public class E205 {
    public boolean isIsomorphic(String s, String t) {
        int[] a1 = new int[127];
        int[] a2 = new int[127];
        for (int i = 0; i < s.length(); i++) {
            if ((a1[s.charAt(i) - ' ']) != (a2[t.charAt(i) - ' '])) {
                return false;
            }
            a1[s.charAt(i) - ' '] = a2[t.charAt(i) - ' '] = i + 1;
        }
        return true;
    }
}
