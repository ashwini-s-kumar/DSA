package striver.atoz.binaryTree.lec2;

import striver.atoz.binaryTree.Pair;
import striver.atoz.binaryTree.TreeNode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class BottomView {
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

        Map<Integer, Integer> bottomView = bottomView(root);
        System.out.println(bottomView);
    }

    private static Map<Integer, Integer> bottomView(TreeNode node) {
        Map<Integer, Integer> result = new HashMap<>();
        if(node == null) {
            return result;
        }
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(node, 0));
        while(!q.isEmpty()) {
            Pair pair = q.poll();
            result.put(pair.num, pair.node.data);

            if(pair.node.left != null) {
                q.add(new Pair(pair.node.left, pair.num-1));
            }
            if(pair.node.right != null) {
                q.add(new Pair(pair.node.right, pair.num+1));
            }
        }
        return result;
    }
}
