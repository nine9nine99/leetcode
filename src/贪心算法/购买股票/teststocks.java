package 贪心算法.购买股票;

public class teststocks {
    public static void main(String[] args){
        int[] stocks = {7, 1, 5, 3, 6, 4};
        buystockes buy = new buystockes();
        int result = buy.Solution(stocks);
        System.out.println(result);
    }
}
