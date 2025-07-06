package striver.atoz.binaryTree.lec3;

import striver.atoz.binaryTree.TreeNode;

public class LeastCommonAncestor {
    public static void main(String [] ar) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(40);
        root.right.left.left = new TreeNode(60);
        root.right.right = new TreeNode(50);
        root.right.right.left = new TreeNode(70);
        root.right.right.right = new TreeNode(80);

        TreeNode lca = leastCommonAncestor(root, 60, 80);
        System.out.println(lca.data);

    }

    private static TreeNode leastCommonAncestor(TreeNode curNode, int n1, int n2) {
        if(curNode == null || curNode.data == n1 || curNode.data == n2) {
            return curNode;
        }
        TreeNode left = leastCommonAncestor(curNode.left, n1, n2);
        TreeNode right = leastCommonAncestor(curNode.right, n1, n2);
        if(left == null) {
            return right;
        }
        if(right == null) {
            return left;
        }
        return curNode;
    }
}
