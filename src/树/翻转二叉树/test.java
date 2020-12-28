package 树.翻转二叉树;

import BiTree.*;

public class test {
    public static void main(String[] args){
        BiTree tree = new BiTree();
        BiTreeNode root = tree.createBiTree();
        flipBTree solution = new flipBTree();
        BiTreeNode result = solution.Solution(root);
        tree.inRootTraverse(result);
    }
}
