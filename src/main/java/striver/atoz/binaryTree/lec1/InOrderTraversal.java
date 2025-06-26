package striver.atoz.binaryTree.lec1;

import striver.atoz.binaryTree.TreeNode;

public class InOrderTraversal {
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        inOrderTraversal(root);
    }

    private static void inOrderTraversal(TreeNode node) {
        if(node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

}
