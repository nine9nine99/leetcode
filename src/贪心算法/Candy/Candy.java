package 贪心算法.Candy;

import java.util.Arrays;

/**
 * 有一群站成一排的孩子，他们有不同的得分。现在要奋发饼干，如果一个孩子的评分比自己身旁的一个孩子要高，那么这个孩子就必须得到比身旁孩子更多的饼干，
 * 所有孩子至少有一个饼干。求解最少需要多少个
 */

public class Candy {
    private int[] children = new int[] {1, 0, 2};
    private int[] cookies = new int[children.length];

    private int[] Solution(int[] children, int[] cookies){
        if (children.length<2){
            cookies = children;
            return cookies;
        }

        //对cookies进行初始化
        for (int i = 0; i < cookies.length; i++){
            cookies[i] = 1;
        }

        //右跟左进行比较
        for (int i = 1; i < children.length; i++){
            if (children[i] > children[i-1]){
                cookies[i] = cookies[i-1] + 1;
            }
        }

        //左跟右进行比较
        for (int i = children.length-1; i > 0; i--){
            if (children[i-1] > children[i]){
                cookies[i-1] = Math.max(cookies[i-1], cookies[i]+1);
            }
        }

        return cookies;
    }

    public static void main(String[] args){
        Candy candy = new Candy();
        int[] result = candy.Solution(candy.children, candy.cookies);
        for (int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
