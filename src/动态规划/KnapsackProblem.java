package 动态规划;

/**
 * 01背包问题
 */
public class KnapsackProblem {
    public static void main(String[] args){
        int[] w = {1, 4, 3};//物品的重量
        int[] val = {1500, 3000, 2000};//物品的价值
        int m = 4; //背包容量
        int n = val.length;//物品个数

        //存放物品的二维数组
        int[][] v = new int[n+1][m+1];
        int[][] path = new int[n+1][m+1];

        //初始化第一列
        for (int i=0; i<v.length; i++)
            v[i][0] = 0;
        //初始化第一行
        for (int i=0; i<v[0].length; i++)
            v[0][i] = 0;

        //根据公式进行动态规划
        for (int i=1; i<v.length; i++)
            for (int j=1; j<v[0].length; j++){
                //如果物体的体积大于现在背包的容量，就将上一行的最大值放入
                if (w[i-1]>j){
                    v[i][j] = v[i-1][j];
                }else {
                    //第i行对应的数据+上一行背包重量合适的数据大于上一行最优数据，则更新
                    if (v[i-1][j]<val[i-1]+v[i-1][j-w[i-1]]){
                        path[i][j] = 1;
                        v[i][j] = val[i-1]+v[i-1][j-w[i-1]];
                }else
                    v[i][j] = v[i-1][j];
            }
        }

        int i = path.length-1;//行数
        int j = path[0].length-1;//列数
        while (i>0&&j>0){
            if (path[i][j]==1){
                System.out.println("第"+i+"个放入背包中");
                j -= w[i-1];
            }
            i--;
        }
    }
}
