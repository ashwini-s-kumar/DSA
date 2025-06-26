package striver.atoz.binaryTree.lec2;

import striver.atoz.binaryTree.TreeNode;

public class IdenticalBT {
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(identicalBT(root, root));
    }

    private static boolean identicalBT(TreeNode p, TreeNode q) {
        if(p == null || q == null) {
            return p == q;
        }
        return p.data == q.data &&
                identicalBT(p.left, q.left) &&
                identicalBT(p.right, q.right);
    }
}
