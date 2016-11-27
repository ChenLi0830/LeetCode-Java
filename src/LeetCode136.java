import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Chen on 2016-11-26.
 */
public class LeetCode136 {
    // with hashSet
    public static int singleNumber2(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int n:nums){
            if (hashSet.contains(n)) hashSet.remove(n);
            else hashSet.add(n);
        }
        Iterator iterator = hashSet.iterator();
        return (Integer) iterator.next();
    }

    public static void main(String[] args){
        singleNumber(new int[]{1});
    }

    // With bit manipulation
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int n:nums) ans ^= n;
        return ans;
    }
}
