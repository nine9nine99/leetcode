package 树.路径总和;

import BiTree.BiTreeNode;

import java.util.LinkedList;
import java.util.Queue;
/**
 * 计算从根到叶子结点指定路径长度
 */

public class cacluatetheCost {
    public boolean Solution(BiTreeNode root, int target, int sum){
        /**
         * 通过使用递归检查数值
         */
        if (sum==target)
            return true;
        if (root == null)
            return false;
        else {
            sum += root.data;
            return Solution(root.lchild, target, sum)||Solution(root.rchild, target, sum);
        }
    }

    public boolean Solution(BiTreeNode root, int target){
        if (root==null)
            return false;
        Queue<BiTreeNode> valnode = new LinkedList<BiTreeNode>();
        Queue<Integer> queval = new LinkedList<Integer>();
        valnode.offer(root);
        queval.offer(root.data);
        while (!valnode.isEmpty()){
            BiTreeNode temp = valnode.poll();
            int val = queval.poll();
            if (val==target)
                return true;
           if (temp.rchild==null&&temp.lchild==null){
               if (val==target)
                   return true;
               continue;
           }
            if (temp.lchild!=null) {
                valnode.offer(temp.lchild);
                queval.offer(temp.lchild.data+val);
            }
            if (temp.rchild!=null){
                valnode.offer(temp.rchild);
                queval.offer(temp.rchild.data+val);
            }
        }
        return false;
    }
}
