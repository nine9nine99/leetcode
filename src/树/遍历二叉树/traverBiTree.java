package 树.遍历二叉树;

import BiTree.BiTreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 使用迭代的方法遍历二叉树
 *
 */
public class traverBiTree {
    //中序遍历二叉树
    public List<Integer> Solution(BiTreeNode root){
        List<Integer> res = new ArrayList<>();//接收遍历完成数组
        Stack<BiTreeNode> stack = new Stack<>();
        BiTreeNode temp = root;
        while (temp!=null||!stack.isEmpty()){
            while (temp!=null){
                stack.push(temp);
                temp = temp.lchild;
            }
            temp = stack.pop();
            res.add(temp.data);
            temp = temp.rchild;
        }
        return res;
    }
}
