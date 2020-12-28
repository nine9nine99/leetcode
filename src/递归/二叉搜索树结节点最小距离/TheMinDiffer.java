package 递归.二叉搜索树结节点最小距离;

import BiTree.*;

public class TheMinDiffer {
    /**
     * 通过使用中序遍历获得升序二叉树
     * @prev 用作记录前一个点
     * @ans 记录结果
     */
    private static BiTreeNode prev = null;
    private static int ans = Integer.MAX_VALUE;

    public static void main(String[] args){
        BiTree tree = new BiTree();
        BiTreeNode root = tree.createBiTree_1();
        int result = Init(root);
        System.out.println(result);
    }

    static int Init(BiTreeNode root){
        Solution(root);
        return ans;
    }

    static void Solution(BiTreeNode root){

        if(root==null)
            return;
        Solution(root.lchild);
        if (prev != null){
            ans = Math.min(ans, root.data - prev.data);
        }
        prev = root;
        Solution(root.rchild);
    }
}
