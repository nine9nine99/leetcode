package 树.levelBS;

import BiTree.BiTree;
import BiTree.BiTreeNode;
import Queue.Queue;

/**
 * 层次遍历二叉树-I
 */
public class levelBS {
    /**
     * 通过使用辅助队列来完成层次遍历
     * */
    Queue<BiTreeNode> queue = new Queue<BiTreeNode>(); //创建辅助队列
    public void Solution(BiTreeNode root){
        if (root!=null){
            queue.enqueue(root); //根结点入队列
            while (!queue.isEmpty()){
                BiTreeNode temp = queue.dequeue();
                System.out.print(temp.data+"\t");
                if (temp.lchild!=null)
                    queue.enqueue(temp.lchild);
                if (temp.rchild!=null)
                    queue.enqueue(temp.rchild);
            }
        }
    }

    public static void main(String[] args){
        BiTree tree = new BiTree();
        BiTreeNode root = tree.createBiTree();
        levelBS result = new levelBS();
        result.Solution(root);
    }
}
