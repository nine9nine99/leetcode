package 树.遍历二叉树;

import BiTree.*;

import java.util.List;

public class test {
    public static void main(String[] args){
        BiTree tree = new BiTree();
        BiTreeNode root = tree.createBiTree_1();
        traverBiTree traverBiTree = new traverBiTree();
        List<Integer> list = traverBiTree.Solution(root);
        for (int i:list)
            System.out.println(i);
    }
}
