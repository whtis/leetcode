/**
 * Created by wht on 2017/4/30.
 */
public class E66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i]++ < 9) {
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;


        return newDigits;
    }
}
