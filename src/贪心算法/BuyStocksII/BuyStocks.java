package 贪心算法.BuyStocksII;

/**
 * 122
 */
public class BuyStocks {
    private int[] stock = {7, 1, 5, 3, 6, 4};

    public void Solution(int[] stock){

        for (int i=0; i<stock.length-1; i++){
            if (stock[i] < stock[i+1]){
                int profit = stock[i+1]-stock[i];
                System.out.printf("第 %d 天卖出拿到的利润是 %d\n", i+2, profit);
                profit = 0;
            }
        }
    }

    public static void main(String[] args){
        BuyStocks buyStocks = new BuyStocks();
        buyStocks.Solution(buyStocks.stock);
    }
}
