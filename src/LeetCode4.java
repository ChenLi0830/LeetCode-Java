/**
 * Created by Chen on 2016-12-05.
 */
public class LeetCode4 {
    public static void main(String[] args) {
        findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4});
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length,
                n = nums2.length,
                l = 0, r = m;
        double ans = 0;

        while (l <= r){
            int i = (l+r)/2;
            int j = ((m+n)%2 == 0) ? (n + m - 2*i) / 2 : (n + m - 2*i - 1) / 2;
            if (i-1 >= 0 && j<nums2.length && nums1[i-1] > nums2[j]) r = i - 1;
            else if (j-1 >= 0 && i<nums1.length && nums2[j-1] > nums1[i]) l = i + 1;
            else {// Found ans
                int leftNum = Math.max(i-1>=0 ? nums1[i-1] : Integer.MIN_VALUE+1, j-1>=0 ? nums2[j-1] : Integer.MIN_VALUE+1);
                int rightNum = Math.min(i<m ? nums1[i] : Integer.MAX_VALUE, j<n ? nums2[j] : Integer.MAX_VALUE);
                if ((m + n) % 2 == 0) ans = (leftNum + rightNum) / 2.0;
                else ans = rightNum;
                break;
            }
        }
        return ans;
    }
}
