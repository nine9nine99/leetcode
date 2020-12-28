package 递归.getmin;

import BiTree.*;

/**
 * 寻找树的最小深度
 */
public class getmin {
    public int Solution(BiTreeNode root){
        if (root==null)
            return 0;
        if (root.rchild==null&&root.lchild==null)
            return 1; //叶子结点判断
        else{
            int lresult = Solution(root.lchild);
            int rresult = Solution(root.rchild);
            return Math.min(lresult, rresult)+1;
        }
    }
}
