package easy;

/**
 * Created by ht on 2016/6/2.
 */
public class NimGame {
    public static void main(String[] args) {
        int n = 9;
        boolean b = canWinNim(n);
        int a = 0;
    }

    private static boolean canWinNim(int n) {
        if (n <= 1) return true;
        if (n % 2 == 0 && n % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
