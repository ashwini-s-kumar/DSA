package striver.atoz.binaryTree.lec2;

import striver.atoz.binaryTree.TreeNode;

public class DiameterBT {
    private static int diameter = 0;
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        heightBT(root);

        System.out.println(diameter);
    }
    private static int heightBT(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int lH = heightBT(node.left);
        int rH = heightBT(node.right);

        diameter = Math.max(diameter, lH + rH);

        return 1 + Math.max(lH, rH);
    }
}
