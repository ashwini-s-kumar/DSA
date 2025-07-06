package striver.atoz.binaryTree.lec2;

import striver.atoz.binaryTree.Pair;
import striver.atoz.binaryTree.TreeNode;

import java.util.*;

public class VerticalOrderTraversalBT {
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

        Map<Integer, PriorityQueue<Integer>> verticalOrderTraversal = verticalOrderTraversal(root);
        System.out.println(verticalOrderTraversal);
    }

    private static Map<Integer, PriorityQueue<Integer>> verticalOrderTraversal(TreeNode root) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        Queue<Pair> q = new ArrayDeque<>();
        if(root == null){
            return map;
        }
        q.add(new Pair(root, 0));
        while(!q.isEmpty()) {
            Pair pair = q.poll();
            if(map.containsKey(pair.num)) {
                map.get(pair.num).add(pair.node.data);
            }
            else {
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                pq.add(pair.node.data);
                map.put(pair.num, pq);
            }

            if(pair.node.left != null) {
                q.add(new Pair(pair.node.left,pair.num-1));
            }
            if(pair.node.right != null) {
                q.add(new Pair(pair.node.right,pair.num+1));
            }
        }
        return map;
    }
}
