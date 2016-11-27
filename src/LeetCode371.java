/**
 * Created by Chen on 2016-11-27.
 */
public class LeetCode371 {
    public int getSum(int a, int b) {
        if (b == 0) return a;
        else return getSum(a ^ b, (a & b) << 1);
    }
}
