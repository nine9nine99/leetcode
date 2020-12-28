package 树.翻转二叉树;

import BiTree.*;

import java.util.LinkedList;
import java.util.Queue;

public class flipBTree {
    public BiTreeNode Solution(BiTreeNode root){
        if (root==null)
            return null;
        Queue<BiTreeNode> queNode = new LinkedList<BiTreeNode>();
        queNode.offer(root);
        while (!queNode.isEmpty()){
            /**
             * 直接交换并将结果存入队列中
             * 交换过程不会导致树断裂
             */
            BiTreeNode current = queNode.poll();
            BiTreeNode temp = current.lchild; //⚠️再依靠个结点交换
            current.lchild = current.rchild;
            current.rchild = temp;
            if (current.lchild!=null)
                queNode.offer(current.lchild);
            if (current.rchild!=null)
                queNode.offer(current.rchild);
        }
        return root;
    }
}
