package 双指针.MergeSortedArray;

import java.util.ArrayList;
import java.util.List;

/**
 * 88
 */

public class MergeArrays {
    public int[] Solution(int[] nums1, int m, int[] nums2, int n){
        int pos = m-- + n-- - 1;

        while (m >= 0 && n >= 0){
            nums1[pos--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }

        while (n>=0){
            nums1[pos--] = nums2[n];
        }

        return nums1;
    }

    public static void main(String[] args){
        MergeArrays mergeArrays = new MergeArrays();
        int[] nums1 = {1, 2, 10, 0, 0, 0};
        int m = 3;
        int[] nums2 = {4, 9, 10};
        int n = 3;
        int[] nums = mergeArrays.Solution(nums1, m, nums2, n);
        for (int i=0 ; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
