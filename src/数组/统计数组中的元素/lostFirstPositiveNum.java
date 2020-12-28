package 数组.统计数组中的元素;

import java.util.*;

/**
 * 寻找丢失的第一个最小正数
 * 用哈希表装入所有数字
 * 遍历寻找最小正数
 */

public class lostFirstPositiveNum {
    public static void main(String[] args){
        int[] nums = {2, 4, 3,0};
        System.out.println(Solution(nums));
    }

    static int Solution(int[] nums){
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            if (nums[i]<=0)
                continue;
            else {
                if (numbers.get(nums[i])==null)
                    numbers.put(nums[i], nums[i]);
            }
        }

        int length = Collections.max(numbers.keySet());
        for (int i=1; i<=length+1; i++){
            if (!numbers.containsKey(i))
                return i;
        }
        return -1;
    }
}
