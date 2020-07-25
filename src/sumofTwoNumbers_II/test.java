package sumofTwoNumbers_II;

public class test {
    public static void main(String[] args){
        int[] nums = {1, 3, 8, 12, 18, 33};
        int target = 9;
        sumofTwoNumbers solution = new sumofTwoNumbers();
        int[] results = solution.Solution(nums, target);
        for (int e:results)
            System.out.print(e+"\t");
    }
}
