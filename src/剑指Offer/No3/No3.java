package 剑指Offer.No3;

import java.util.HashSet;
import java.util.Set;

/**
 * -1
 */

public class No3 {
    private int[] tesy_nums = {1, 2, 4, 19, 32, 99, 2, 1, 49, 4};

    private int compare(int[] nums){
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;

        for (int num : nums){
            if (!set.add(num)){
                repeat = num;
                break;
            }
        }
        return repeat;
    }

    public static void main(String[] args){
        No3 no3 = new No3();
        int result = no3.compare(no3.tesy_nums);
        System.out.println(result);
    }

}
