package 双指针.TwoSum;


/**
 * 167
 */

public class TwoSum {
    private int[] numbers = new int[] {4, 5, 10 ,44, 90};

    public int[] Solution(int[] numbers, int aim){
        int[] result = new int[2];
        int right = numbers.length-1;
        int left = 0;

        while (left != right){
            int sum = numbers[left] + numbers[right];
            if (sum == aim){
                result[0] = left;
                result[1] = right;
                return result;
            }else if (sum < aim){
                left++;
            }else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args){
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.Solution(twoSum.numbers, 9);
        for (int i : result){
            System.out.println(i);
        }
    }
}
