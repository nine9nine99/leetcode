package getmin;

import BiTree.*;

public class getmindeep {
    public static void main(String[] args){
        BiTree tree = new BiTree();
        BiTreeNode root = tree.createBiTree();
        getmin getminresult = new getmin();
        int result = getminresult.Solution(root);
        System.out.print(result);
    }
}
