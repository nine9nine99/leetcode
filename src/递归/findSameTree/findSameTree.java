package 递归.findSameTree;

import BiTree.BiTree;
import BiTree.BiTreeNode;

/**
 * 寻找两棵完全一样的树
 */

public class findSameTree {

    /**
     * 通过递归寻找两个一样的树
     *
     */
    public boolean Solution(BiTreeNode T, BiTreeNode other){
        if (T==null&&other==null)
            return true;
        if (T==null||other==null)
            return false;
        if (T.data == other.data){
            return Solution(T.lchild, other.lchild)&&Solution(T.rchild, other.rchild); //Solution(T.lchild, other.lchild) Solution(T.rchild, other.rchild)该方法只会进行不断的递归
            //无法产生任何有效结果
        }else{
            return false;
        }
        //return true;
    }


    public static void main(String[] args){
        BiTree tree_1 = new BiTree();
        BiTree tree_2 = new BiTree();
        BiTreeNode root_1 = tree_1.createBiTree_1();
        BiTreeNode root_2 = tree_2.createBiTree_2();
        findSameTree findSameTree = new findSameTree();
        boolean result = findSameTree.Solution(root_1, root_2);
        System.out.print(result);
    }
}
