package 贪心算法.NonoverlappingIntervals;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 输入一个数组，数组由多个长度固定为2的数组组成，表示区间的开始和结尾。输出一个数字，表示需要移除的区间数量。
 */

public class NonoverlappingIntervals {
    private int[][] input = new int[][] {{1,2}, {2,4}, {1,3}};

    private int Solution(int[][] input){
        Arrays.sort(input, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int length = input.length;
        int right = input[0][1]; //排序后最小长度
        int result = 0;

        for (int i=1; i < length; i++){
            if (input[i][0]>=right){
                right = input[i][1];
            }else {
                result ++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        NonoverlappingIntervals nonoverlappingIntervals = new NonoverlappingIntervals();
        int result = nonoverlappingIntervals.Solution(nonoverlappingIntervals.input);
        System.out.println(result);
    }
}
