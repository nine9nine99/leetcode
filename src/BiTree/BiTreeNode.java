package BiTree;

public class BiTreeNode {
    public int data;
    public BiTreeNode lchild, rchild;

    public BiTreeNode(int data){
        this.data = data;
        this.lchild = null;
        this.rchild = null;
    }

    public BiTreeNode(int data, BiTreeNode lchild, BiTreeNode rchild){
        this.data = data;
        this.lchild = lchild;
        this.rchild = rchild;
    }
}
