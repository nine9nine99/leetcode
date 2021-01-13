package 贪心算法.AssignCookies;

import java.util.Arrays;

public class AssignCookies {
    private int[] child = new int[]{1, 2};
    private int[] cookies = new int[]{3, 2, 1};

    private int Solution(int[] child, int[] cookies){
        Arrays.sort(child);
        Arrays.sort(cookies);
        int child_num = 0;
        int child_size = 0, cookies_size = 0;

        for (int i = 0; i<child.length; i++){
            if (child[child_size] <= cookies[cookies_size]){
                child_num += 1;
                child_size++;
                cookies_size++;
            }else {
                cookies_size++;
            }
        }

        return child_num;
    }

    public static void main(String[] args){
        AssignCookies assignCookies = new AssignCookies();
        int result = assignCookies.Solution(assignCookies.child, assignCookies.cookies);
        System.out.println(result);
    }
}
