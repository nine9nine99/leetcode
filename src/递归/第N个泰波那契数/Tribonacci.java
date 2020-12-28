package 递归.第N个泰波那契数;

public class Tribonacci {
    public static int[] nums = new int[38];
    public static void main(String[] args){
        int result = Init(5);
        System.out.println(result);
    }

    static int Init(int n){
        nums[1] = 1;
        nums[2] = 1;
        Solution(n-1);
        return nums[n-1];
    }

    static int Solution(int n){
        /**
         * 使用数组存储数据
         * 用nums[0] = 0作为截止条件
         */
        if (n==0)
            return 0;
        if (nums[n]==0)
            nums[n] = Solution(n-1) + Solution(n-2) + Solution(n-3);
        return nums[n];
    }
}
