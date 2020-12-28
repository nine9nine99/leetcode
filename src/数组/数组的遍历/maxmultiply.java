package 数组.数组的遍历;

import java.util.Arrays;

/**
 * 三个数的最大乘积
 */

public class maxmultiply {
    public static void main(String[] args){
        int[] nums = {-1, -5, -2, -3, -4};
        System.out.print(Solution(nums));
    }

    /**
     * @param nums
     * @return 返回一个排序数组中最大的三个数乘积。出现负数则为前两个乘最后一个
     */
    static int Solution(int[] nums){
        Arrays.sort(nums);//从小到大排列
        return Math.max(nums[0]*nums[1]*nums[nums.length-1], nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
    }
}
