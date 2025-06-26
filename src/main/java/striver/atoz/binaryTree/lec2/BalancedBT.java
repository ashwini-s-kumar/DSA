package striver.atoz.binaryTree.lec2;

import striver.atoz.binaryTree.TreeNode;

public class BalancedBT {
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left= new TreeNode(3);

        root.left.left.left = new TreeNode(4);
        root.left.left.left.left = new TreeNode(5);

        System.out.println(balancedBT(root));
    }

    private static boolean balancedBT(TreeNode root) {
        return dfsBT(root) != -1;
    }

    private static int dfsBT(TreeNode node) {
        if( node == null) {
            return 0;
        }
        int lH =  dfsBT(node.left);
        if(lH == -1) {
            return -1;
        }

        int rH = dfsBT(node.right);
        if(rH == -1) {
            return -1;
        }

        if(Math.abs(lH - rH) > 1) {
            return -1;
        }
        return 1 + Math.max(lH, rH);
    }
}
