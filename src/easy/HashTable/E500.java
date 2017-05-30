package easy.HashTable;

import java.util.*;

/**
 * Created by wht on 2017/5/17.
 */
public class E500 {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String c = String.valueOf(words[i].toLowerCase().charAt(0));
            boolean b = false;
            if (s1.contains(c)) {
                b = checkWords(s1, words[i].toLowerCase());
            } else if (s2.contains(c)) {
                b = checkWords(s2, words[i].toLowerCase());
            } else if (s3.contains(c)) {
                b = checkWords(s3, words[i].toLowerCase());
            }
            if (b) {
                list.add(words[i]);
            }

        }
        return list.toArray(new String[0]);
    }

    private boolean checkWords(String s1, String word) {
        for (int i = 1; i < word.length(); i++) {
            if (!s1.contains(String.valueOf(word.charAt(i)))) {
                return false;
            }
        }
        return true;
    }


}
