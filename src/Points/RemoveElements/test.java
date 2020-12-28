package Points.RemoveElements;

public class test {
    public static void main(String[] args){
        int[] nums = {1, 2, 4, 5,2, 10};
        int target = 2;

        removeElement remove = new removeElement();
        int result = remove.Solution(nums, target);
        System.out.print(result);
    }

}

