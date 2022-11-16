package easy;

/**
 * Created by ht on 2016/6/2.
 */
public class reverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }

    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
