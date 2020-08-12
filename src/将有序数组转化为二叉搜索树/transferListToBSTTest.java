package 将有序数组转化为二叉搜索树;

import BiTree.BiTree;
import BiTree.BiTreeNode;

public class transferListToBSTTest {
    public static void main(String[] args){
        int[] nums = {-10, -3, 0, 5, 9};
        transferListToTree transferListToTree = new transferListToTree();
        BiTreeNode root = transferListToTree.sortedArrayToBST(nums);
        BiTree tree = new BiTree();
        tree.inRootTraverse(root);
    }
}
