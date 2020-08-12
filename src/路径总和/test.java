package 路径总和;

import BiTree.*;

public class test {
    public static void main(String[] args){
        cacluatetheCost solution = new cacluatetheCost();
        BiTree tree = new BiTree();
        BiTreeNode root = tree.createBiTree();
        boolean result = solution.Solution(root, 6);
        System.out.println(result);
    }
}
