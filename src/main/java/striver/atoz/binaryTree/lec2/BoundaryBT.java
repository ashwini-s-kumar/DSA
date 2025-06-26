package striver.atoz.binaryTree.lec2;

import striver.atoz.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BoundaryBT {
    private static List<Integer> res = new ArrayList<>();
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(4);
        root.left.left.right.left =  new TreeNode(5);
        root.left.left.right.right =  new TreeNode(6);

        root.right = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);
        root.right.right.left.left = new TreeNode(10);
        root.right.right.left.right = new TreeNode(11);

        boundaryBT(root);

    }

    private static void boundaryBT(TreeNode root) {
        if(root == null) {
            return;
        }
        if(!isLeaf(root)) {
            res.add(root.data);
        }
        addLeftBoundary(root);
        addLeafs(root);
        addRightBoundary(root);
        System.out.println(res);
    }

    static void addLeftBoundary(TreeNode node) {
        TreeNode cur = node.left;
        while(cur != null) {
            if (!isLeaf(cur)) {
                res.add(cur.data);
            }
            if (cur.left != null) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
    }
    static void addRightBoundary(TreeNode node) {
        List<Integer> right = new ArrayList<>();
        TreeNode cur = node.right;
        while(cur != null) {
            if (!isLeaf(cur)) {
                right.add(cur.data);
            }
            if (cur.right != null) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }
        }

        for(int i = right.size() - 1; i >= 0; i--) {
            res.add(right.get(i));
        }
    }

    static void addLeafs(TreeNode node) {
        if(isLeaf(node)) {
            res.add(node.data);
            return;
        }
        if(node.left != null) {
            addLeafs(node.left);
        }
        if(node.right != null) {
            addLeafs(node.right);
        }
    }


    private static boolean isLeaf(TreeNode cur) {
        return cur.left == null && cur.right == null;
    }
}
