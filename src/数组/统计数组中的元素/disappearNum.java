package 数组.统计数组中的元素;

import java.util.*;

/**
 * 寻找丢失的数字
 */
public class disappearNum {
    public static void main(String[] args){
        int[] nums = {1, 2, 4, 6};
        List<Integer> list = Solution(nums);
        list.toString();
        System.out.println(list);
    }

    static List<Integer> Solution(int[] nums){
        Map<Integer, Integer> numbers = new HashMap<>();
        List<Integer> list= new ArrayList<>();
        //将出现过的数字放入hash表中
        for (int i=0; i<nums.length; i++){
            int num = nums[i];
            if (numbers.get(num)==null)
                numbers.put(num,num);
        }

        int length = Collections.max(numbers.keySet());
        for (int j=1; j< length; j++){
            if (!numbers.containsValue(j))
                list.add(j);
        }
        return list;
    }
}
