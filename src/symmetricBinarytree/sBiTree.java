package symmetricBinarytree;

import BiTree.BiTree;
import BiTree.BiTreeNode;

/**
 * 判断是否是对称二叉树
 */
public class sBiTree {
    /**
     * 通过使用递归的方法判断
     */
    public boolean checkroot(BiTreeNode root){
        if (root==null)
            return false;
        if (root.lchild==null&&root.rchild==null)
            return true;
        if (root.lchild.data!=root.rchild.data)
            return false;
        else
            return Solution(root.lchild, root.rchild);
    }

    public boolean Solution(BiTreeNode root_1, BiTreeNode root_2){
        if (root_1==null && root_2==null) {
            return true;
        }
        if (root_1==null||root_2==null)
            return false;
        if (root_1.data==root_2.data)
            return Solution(root_1.lchild, root_2.rchild)&&Solution(root_1.rchild, root_2.lchild);
        else
            return false;
    }

    public static void main(String[] args){
        BiTree tree = new BiTree();
        BiTreeNode root = tree.createBiTree();
        sBiTree sBiTree = new sBiTree();
        Boolean result = sBiTree.checkroot(root);
        System.out.print(result);
    }
}
