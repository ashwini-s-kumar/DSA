package striver.atoz.binaryTree.lec3;

import striver.atoz.binaryTree.TreeNode;

public class CountNodeCompleteBT {
    public static void main(String [] arr) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int count = countNodeCompleteBT(root);
        System.out.println(count);
    }

    private static int countNodeCompleteBT(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int lh = leftHeight(node);
        int rh = rightHeight(node);
        if(lh == rh) {
            return (int) (Math.pow(2, lh) - 1);
        }
        return 1 + countNodeCompleteBT(node.left) +
                countNodeCompleteBT(node.right);
    }

    private static int rightHeight(TreeNode node) {
        int height = 0;
        while(node != null) {
            height += 1;
            node = node.right;
        }
        return height;
    }

    private static int leftHeight(TreeNode node) {
        int height = 0;
        while(node != null) {
            height += 1;
            node = node.left;
        }
        return height;
    }


}
