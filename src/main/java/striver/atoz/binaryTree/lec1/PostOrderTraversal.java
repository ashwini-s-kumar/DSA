package striver.atoz.binaryTree.lec1;

import striver.atoz.binaryTree.TreeNode;

public class PostOrderTraversal {
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        postOrderTraversal(root);
    }

    private static void postOrderTraversal(TreeNode node) {
        if(node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }
}
