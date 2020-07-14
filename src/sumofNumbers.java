/**
 * 求两数之和
 * */

public class sumofNumbers {
    public static void main(String[] args){
        int[] nums = {2,3,11,15,7};
        int target = 9;

        for (int i=0; i<nums.length; i++)
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]+nums[j]==target){
                    System.out.print(i+"\t"+j);
                }
            }
    }
}
