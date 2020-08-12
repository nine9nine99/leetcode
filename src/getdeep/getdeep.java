package getdeep;

import BiTree.BiTreeNode;

/**
 * 获取树的最大深度
 */
public class getdeep {
    /**
     *
     * 通过迭代的方式获取最大深度
     * @param root
     * @return
     */
    public int Solution(BiTreeNode root){
        if (root.lchild==null&&root.rchild==null)
            return 1;
        else {
            int rresult = Solution(root.rchild);
            int lresult = Solution(root.lchild);
            return Math.max(rresult, lresult)+1; //通过Math.max方法判断大小
        }
    }
}
