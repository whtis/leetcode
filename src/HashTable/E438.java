package HashTable;

import java.util.*;

/**
 * Created by wht on 2017/5/18.
 */
public class E438 {
    /*TLE
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        char[] cs = p.toCharArray();
        Arrays.sort(cs);
        p = String.valueOf(cs);
        int range = s.length() - p.length();
        Hashtable<Integer, String> ht = new Hashtable<>();
        for (int i = 0; i <= range; i++) {
            String str = s.substring(i, i + p.length());
            ht.put(i, str);
        }

        Iterator iterator = ht.keySet().iterator();
        while (iterator.hasNext()) {
            Integer index = (Integer) iterator.next();
            char[] chars = ht.get(index).toCharArray();
            Arrays.sort(chars);

            if (String.valueOf(chars).equals(p)) {
                list.add(index);
            }
        }
        return list;
    }
    */

    /*
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        char[] cs = p.toCharArray();
        Arrays.sort(cs);
        p = String.valueOf(cs);
        int range = s.length() - p.length();
        for (int i = 0; i <= range; i++) {
            char c = s.charAt(i);
            if (p.contains(String.valueOf(c))) {
                String str = s.substring(i, i + p.length());
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                str = String.valueOf(chars);
                if (str.equals(p)) {
                    list.add(i);
                }
            }
        }
        return list;
    }
    */

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
        int[] hash = new int[256]; //character hash
        //record each character in p to hash
        for (char c : p.toCharArray()) {
            hash[c]++;
        }
        //two points, initialize count to p's length
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            //move right everytime, if the character exists in p's hash, decrease the count
            //current hash value >= 1 means the character is existing in p
            if (hash[s.charAt(right++)]-- >= 1) count--;

            //when the count is down to 0, means we found the right anagram
            //then add window's left to result list
            if (count == 0) list.add(left);

            //if we find the window's size equals to p, then we have to move left (narrow the window) to find the new match window
            //++ to reset the hash because we kicked out the left
            //only increase the count if the character is in p
            //the count >= 0 indicate it was original in the hash, cuz it won't go below 0
            if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) count++;
        }
        return list;
    }
}
