package 贪心算法;

/**
 * 以最大的利润购买股票
 */

public class buystockes {
    /**
     * 股票购买时机为第一个读入的数字小于第二个读入的数字，因此只要计算增长过的幅度即可
     * @param stocks
     * @return
     */
    public int Solution(int[] stocks){
        int result = 0;
        for (int i=0; i+1< stocks.length; i++){
            if (stocks[i]<stocks[i+1]){
                result += stocks[i+1]-stocks[i];
            }
        }
        return result;
    }
}
