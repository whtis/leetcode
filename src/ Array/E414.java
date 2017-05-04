import java.util.Objects;

/**
 * Created by wht on 2017/3/13.
 */
public class E414 {

    public int thirdMax(int[] nums) {

        Integer maxFirst = null, maxSecond = null, maxThird = null;

        for (int num : nums) {
            if (Objects.equals(num, maxFirst) || Objects.equals(num, maxSecond) || Objects.equals(num, maxThird))
                continue;
            // if顺序不能改变，如果改变顺序，判断条件会相应增加
            if (null == maxFirst || num > maxFirst) {
                maxThird = maxSecond;
                maxSecond = maxFirst;
                maxFirst = num;
            } else if (null == maxSecond || num > maxSecond) {
                maxThird = maxSecond;
                maxSecond = num;
            } else if (null == maxThird || num > maxThird) {
                maxThird = num;
            }
        }

//        if (maxThird == null) {
//            return maxFirst;
//        } else {
//            return maxThird;
//        }
        return maxThird == null ? maxFirst : maxThird;
    }
}

