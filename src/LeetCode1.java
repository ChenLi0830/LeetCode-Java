import java.util.HashMap;

/**
 * Created by Chen on 2016-11-26.
 */
public class LeetCode1 {
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++){
            int value = target - nums[i];
            if (hashMap.containsKey(value)) {
                return new int[]{i, hashMap.get(value)};
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return new int[]{-1,-1}; // If no pairs are found.
    }

    public static void main(String[] args){
        twoSum(new int[]{1,2,3,4,5,6,7}, 12);
    }
}
