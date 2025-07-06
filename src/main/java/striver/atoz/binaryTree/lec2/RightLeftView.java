package striver.atoz.binaryTree.lec2;

import striver.atoz.binaryTree.Pair;
import striver.atoz.binaryTree.TreeNode;

import java.util.*;

public class RightLeftView {
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);

        root.left.left.right = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);

        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(10);

        rightLeftView(root);
    }

    private static void rightLeftView(TreeNode node) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        if(node == null) {
            return;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(node);
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                if(i == 0) {
                    left.add(cur.data);
                }
                if(i == size-1) {
                    right.add(cur.data);
                }
                if(cur.left != null) {
                    q.add(cur.left);
                }
                if(cur.right != null) {
                    q.add(cur.right);
                }
            }
        }
        System.out.println("left view : "+ left);
        System.out.println("right view : "+ right);
    }
}
