package striver.atoz.binaryTree.lec2;

import striver.atoz.binaryTree.TreeNode;

import java.util.List;

public class VerticalOrderTraversalBT {
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);

        root.left.left.right = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);

        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(10);

        //List<List<Integer>> bfsLevelWise = bfsLevelWise(root);
        //System.out.println(bfsLevelWise);
    }
}
