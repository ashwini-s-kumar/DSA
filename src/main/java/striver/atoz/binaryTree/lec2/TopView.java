package striver.atoz.binaryTree.lec2;

import striver.atoz.binaryTree.Pair;
import striver.atoz.binaryTree.TreeNode;

import java.util.*;

public class TopView {
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

        Map<Integer, Integer> topView = topView(root);
        System.out.println(topView);
    }

    private static Map<Integer, Integer> topView(TreeNode node) {
        Map<Integer, Integer> result = new HashMap<>();
        if(node == null) {
            return result;
        }
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(node, 0));
        while(!q.isEmpty()) {
            Pair pair = q.poll();
            if(!result.containsKey(pair.num)) {
                result.put(pair.num, pair.node.data);
            }
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
