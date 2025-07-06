package striver.atoz.binaryTree.lec2;

import striver.atoz.binaryTree.TreeNode;

public class IsSymmetricBT {
    public static void main(String [] arr) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);

        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(3);

        System.out.println(isSymmetricBT(root1, root2));
    }

    private static boolean isSymmetricBT(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null) {
            return  root1 == root2;
        }
        return root1.data == root2.data &&
                isSymmetricBT(root1.left, root2.right) &&
                isSymmetricBT(root1.right, root2.left);
    }
}
