package easy;

/**
 * Created by whtis on 18-1-27.
 */
public class E657 {
    public boolean judgeCircle(String moves) {
        int u = 0, d = 0, l = 0, r = 0;
        int index = 0;
        while (index < moves.length()) {
            char c = moves.charAt(index);
            switch (c) {
                case 'U':
                    u++;
                    break;
                case 'D':
                    d++;
                    break;
                case 'L':
                    l++;
                    break;
                case 'R':
                    r++;
                    break;
                default:
                    break;
            }
            index++;
        }
        return u == d && l == r;
    }
}
