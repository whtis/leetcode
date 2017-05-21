package HashTable;

import java.util.*;

/**
 * Created by wht on 2017/5/21.
 */
public class E290 {
    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        if (pattern.length() != strings.length) return false; //attention one
        Hashtable<String, String> stringHashtable = new Hashtable<>();
        for (int i = 0; i < strings.length; i++) {
            String p = String.valueOf(pattern.charAt(i));
            if (stringHashtable.containsKey(p)) {
                if (!Objects.equals(stringHashtable.get(p), strings[i])) {
                    return false;
                }
            } else {
                if (stringHashtable.containsValue(strings[i])) return false; //attention two
                stringHashtable.put(p, strings[i]);
            }

            /* 以上可简化为
            if (!Objects.equals(index.put(pattern.charAt(i), i),index.put(words[i], i)))
                return false;
             */
        }
        return true;
    }
}
