package 将有序数组转化为二叉搜索树;

import BiTree.BiTreeNode;

/**
 * 将一个有序升序数组转化为高度平衡二叉树
 * 高度平衡二叉树是指每个节点的左右两个子树的高度差的绝对值不超过1
 */

public class transferListToTree {
    /**
     *通过使用中序遍历（中序遍历对应升序）实现高度平衡的二叉树
     */
     public BiTreeNode sortedArrayToBST(int[] nums){
         return Solution(nums, 0, nums.length-1);//注意范围
     }

     public BiTreeNode Solution(int[] nums, int lo, int hi){
         if (lo>hi)
             return null;
         int mid = (lo+hi)/2;
         BiTreeNode root = new BiTreeNode(nums[mid]);
         root.lchild = Solution(nums, lo, mid-1);
         root.rchild = Solution(nums, mid+1, hi);

         return root;
     }
}
