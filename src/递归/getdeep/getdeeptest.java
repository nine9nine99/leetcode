package 递归.getdeep;

import BiTree.*;

public class getdeeptest {
    public static void main(String[] args){
        BiTree tree = new BiTree();
        BiTreeNode root = tree.createBiTree_1();
        getdeep deep_result = new getdeep();
        int result = deep_result.Solution(root);
        System.out.print(result);
    }
}
