package striver.atoz.binaryTree.lec3;

import striver.atoz.binaryTree.TreeNode;

public class ChildSumProperty {
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(35);
        root.left = new TreeNode(20);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        boolean isChildSum = isChildSum(root);
        System.out.println(isChildSum);
    }

    private static boolean isChildSum(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(root.left == null && root.right == null) {
            return true;
        }
        int sum = 0;
        if(root.left != null) {
            sum += root.left.data;
        }
        if(root.right != null) {
            sum += root.right.data;
        }

        return root.data == sum &&
                isChildSum(root.left) &&
                isChildSum(root.right);
    }
}
