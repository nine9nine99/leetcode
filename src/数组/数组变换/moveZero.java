package 数组.数组变换;

public class moveZero {
    public static void main(String[] args){
        int[] nums = {0, 1, 2, 0, 4};
        Solution(nums);
        for (int i=0; i<nums.length; i++)
            System.out.print(nums[i] + "\t");
    }

    /**
     * 使用两个指针i，j完成操作
     * 1：将所有非0元素左移
     * 2：j现在的位置就是
     * @param nums
     */
    static void Solution(int[] nums){
        int j=0;
        if (nums==null)
            return;
        for (int i=0; i<nums.length; i++){
            if (nums[i]!=0)
                nums[j++] = nums[i];
        }
        for (; j<nums.length; ++j){
            nums[j] = 0;
        }
    }
}
