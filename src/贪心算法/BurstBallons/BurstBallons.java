package 贪心算法.BurstBallons;
/**
 * 452
 */

import java.util.Arrays;
import java.util.Comparator;

public class BurstBallons {
    private int[][] input = new int[][] {{1,2},{2,3},{3,9},{4,5}};

    public int Solution(int[][] input){
        Arrays.sort(input, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] > o2[1]){
                    return 1;
                }else if (o1[1]<o2[1]){
                    return -1;
                }else {
                    return 0;
                }
            }
        });

        int right = input[0][1];
        int shoot = 1;
        for (int i = 1; i < input.length; i++){
            if (input[i][0]<=right && right<=input[i][1]){
                continue;
            }else {
                shoot++;
                right = input[i][1];
            }
        }

        return shoot;
    }

    public static void main(String[] args){
        BurstBallons burstBallons = new BurstBallons();
        int shoot = burstBallons.Solution(burstBallons.input);
        System.out.println(shoot);
    }
}
