package 数组.二维数组及滚动数组;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 使用动态规划思想完成杨辉三角的打印
 * 重点：数据结构的使用
 */
public class PasclesTriangel {
    public static void main(String[] args){
        System.out.println("输入打印杨辉三角形的行数：");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        List<List<Integer>> results = Solution(numbers);
        for (List<Integer> i:results){
            System.out.print(i);
            System.out.println();
        }
    }

    static List<List<Integer>> Solution(int numRows){
        List<List<Integer>> triangel = new ArrayList<List<Integer>>();

        //如果输入数字为0，直接返回空数字
        if (numRows==0)
            return triangel;

        //有行数时，对于triangle中的每一位，创建一个行数组，每一行的第一个元素和最后一个元素都为1，第一行只能为1。
        triangel.add(new ArrayList<>());

        triangel.get(0).add(1);

        //从第二行开始计算
        for (int rowNum = 1; rowNum<numRows; rowNum++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangel.get(rowNum-1);

            row.add(1);
            for (int j=1; j<rowNum; j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            row.add(1);

            triangel.add(row);
        }
        return triangel;
    }
}
