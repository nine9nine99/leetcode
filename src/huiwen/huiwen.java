package huiwen;
/**
 * 回文数
 * */
public class huiwen {
    /**
     * 通过使用双指针进行
     * */
    public boolean Solution(String nums){
        int low = 0;
        int high = nums.length()-1;
        while (low!=high){
            int num_1 = nums.charAt(low);
            int num_2 = nums.charAt(high);
            if (num_1==num_2){
                low += 1;
                high -= 1;
            }else {
                return false;
            }
        }
        return true;
    }

}
