package striver.atoz.binaryTree.lec2;

import striver.atoz.binaryTree.TreeNode;

public class HeightBT {

    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(heightBT(root));
    }

    private static int  heightBT(TreeNode node) {
        if(node == null) {
            return 0;
        }
        return 1 + Math.max(heightBT(node.left), heightBT(node.right));
    }
}
