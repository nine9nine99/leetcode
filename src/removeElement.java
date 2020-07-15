/**
 * 移除数组中的相同元素
 * 通过使用双指针i，j来筛选相同元素
 * 其中i为慢指针，j为快指针。当出现目标元素时，跳过nums[j]；出现非目标元素，记录回nums[]
 * 最终输出数组新长度
 * */

public class removeElement {
    public int Solution(int[] nums, int val){
        int i=0;
        int j;

        for (j=0; j<nums.length-1; j++){
            if (nums[j]!=val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
