package easy.HashTable;

import java.util.HashSet;

/**
 * Created by wht on 2017/5/17.
 */
//hashset，放入不重复的个数，如果＞=长度/2，则返回长度/2，如果＜，则返回个数
public class E575 {
    public int distributeCandies(int[] candies) {
        HashSet set = new HashSet();
        for (int candy : candies) {
            set.add(candy);
        }
//        if (set.size() >= candies.length / 2) {
//            return candies.length / 2;
//        } else {
//            return set.size();
//        }

        //或者
        return set.size() >= candies.length / 2 ? candies.length / 2 : set.size();
    }
}
