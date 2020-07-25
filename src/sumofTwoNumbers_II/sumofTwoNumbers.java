package sumofTwoNumbers_II;

public class sumofTwoNumbers {
    /**
     * 双指针在不重复使用元素下完成查找两数之和
     * */
    public int[] Solution(int[] nums, int target){
        int[] results = {-1, -1};
        if (nums.length>0){
            int low = 0, high = nums.length-1;
            while (nums[low]+nums[high]!=target&&low<=high){
                if (nums[low]+nums[high]<target){
                    low += 1;
                }else {
                    high -= 1;
                }
            }
            results[0] = low+1;
            results[1] = high+1;
            return results;
        }
        return results;
    }
}
