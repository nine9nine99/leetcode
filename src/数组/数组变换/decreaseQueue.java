package 数组.数组变换;

/**
 * 非递减队列
 * 将一个递减队列变为一个非递减队列
 */
public class decreaseQueue {
    public static void main(String[] args){
        int[] nums = {3,2,1};
        System.out.print(Solution(nums));
    }

    static boolean Solution(int[] nums){
        int count = 0;
        for (int i=1; i<nums.length; i++){
            if (nums[i]<nums[i-1]){
                nums[i-1] = nums[i];
                count++;
            }
        }
        return count<2;
    }
}
