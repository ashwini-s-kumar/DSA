package striver.atoz.binaryTree.lec2;

import striver.atoz.binaryTree.TreeNode;

public class MaxPathSum {
    private static int maxPathSum = 0;
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        maxPathSum(root);

        System.out.println(maxPathSum);
    }
    private static int maxPathSum(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int lMaxPath = maxPathSum(node.left);
        int rMaxPath = maxPathSum(node.right);

        maxPathSum = Math.max(maxPathSum, node.data + lMaxPath + rMaxPath);
        return node.data + Math.max(lMaxPath, rMaxPath);
    }
}
