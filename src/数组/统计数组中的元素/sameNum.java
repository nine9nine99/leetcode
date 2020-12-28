package 数组.统计数组中的元素;


import java.util.*;

/**
 * 数组中的出现2次的元素
 */
public class sameNum {
    public static void main(String[] args){
        int[] nums = {2,1, 3, 4, 4, 5,2 ,5};
        Solution(nums);
    }

    static void Solution(int[] nums){
        Map<Integer, Integer> arrays = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<nums.length; i++){
            int x = nums[i];
            if (arrays.get(x)==null)
                arrays.put(x, 1);
            else {
                list.add(x);
            }
        }
        for (int i:list)
            System.out.println(i);

    }
}
