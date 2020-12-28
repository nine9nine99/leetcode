package 堆;

public class findMinNum_topkTest {
    public static void main(String[] args){
        findMinNum_topk k = new findMinNum_topk();
        int[] arr = {1, 4, 19, 22, 2, 9, 39, 54};
        int[] res = k.Solution(arr, 3);
        for (int i:res)
            System.out.print(i+"\t");
    }
}
