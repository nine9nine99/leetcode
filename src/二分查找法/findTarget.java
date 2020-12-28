package 二分查找法;

/**
 * 二分查找法寻找元素
 *
 * */

public class findTarget {
    public int Solution(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        if (end<0)
            return -1;

        while (start<=end){ //二分查找最终start=end
            int mid = (start+end)/2;

            if (nums[mid]==target){
                return mid;
            }else if (target>mid){
                start = mid+1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
