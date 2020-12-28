package 数组.数组的遍历;

/**
 * 寻找最大连续1的个数
 */
public class maxOne {
    public static void main(String[] args){
        int[] nums = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1};
        System.out.print(Solution(nums));
    }

    static int Solution(int[] nums){
        int max = 0;
        int result = 0;
        int i = 0;
        if (nums.length==0)
            return max;
        while (i<nums.length){
            if (nums[i]!= 0){
                result += 1;
                i++;
            }else {
                if (max<result)
                    max = result;
                result = 0;
                i++;
            }
        }
        return Math.max(result, max);
    }
}
