package BiTree;

import java.net.ServerSocket;

public class BiTree {
    public BiTreeNode root;

    public BiTree(){
        this.root = null;
    }

    public BiTree(BiTreeNode root){
        this.root = root;
    }

    //先序递归二叉树
    public void preRootTraverse(BiTreeNode T){
        if (T!=null){
        System.out.print(T.data+"\t");
        preRootTraverse(T.lchild);
        preRootTraverse(T.rchild);
        }
    }

    //中序遍历二叉树
    public void inRootTraverse(BiTreeNode T){
        if (T!=null){
        inRootTraverse(T.lchild);
        System.out.print(T.data+"\t");
        inRootTraverse(T.rchild);
        }
    }

    //后序遍历二叉树
    public void postRootTraverse(BiTreeNode T){
        if (T!=null){
        postRootTraverse(T.lchild);
        postRootTraverse(T.rchild);
        System.out.print(T.data + "\t");
        }
    }

    public BiTreeNode createBiTree(){
        //BiTreeNode h = new BiTreeNode(10);
        BiTreeNode d = new BiTreeNode(3);
        BiTreeNode e = new BiTreeNode(5);
        BiTreeNode f = new BiTreeNode(4);
        BiTreeNode g = new BiTreeNode(3);
        BiTreeNode b = new BiTreeNode(2, d, e);
        BiTreeNode c = new BiTreeNode(2, f, g);
        BiTreeNode a = new BiTreeNode(1, b, c);
        return a;
    }

    public BiTreeNode createBiTree_1(){
        BiTreeNode a = new BiTreeNode(2);
        BiTreeNode b = new BiTreeNode(3);
        BiTreeNode c = new BiTreeNode(1, a, b);
        return c;
    }

    public BiTreeNode createBiTree_2(){
        BiTreeNode a = new BiTreeNode(4);
        BiTreeNode b = new BiTreeNode(3);
        BiTreeNode c = new BiTreeNode(1, a, b);
        return c;
    }

}
