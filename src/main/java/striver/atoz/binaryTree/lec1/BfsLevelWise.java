package striver.atoz.binaryTree.lec1;

import striver.atoz.binaryTree.TreeNode;

import java.util.*;

public class BfsLevelWise {
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> bfsLevelWise = bfsLevelWise(root);
        System.out.println(bfsLevelWise);
    }

    private static List<List<Integer>> bfsLevelWise(TreeNode node) {
        if(node == null) {
            Collections.emptyList();
        }
        List<List<Integer>> bfs = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(node);
        while(!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subLevel = new ArrayList<>();
            for(int i = 0; i < levelNum; i++) {
                TreeNode cur = queue.poll();
                subLevel.add(cur.data);

                if(cur.left != null) {
                    queue.add(cur.left);
                }

                if(cur.right != null) {
                    queue.add(cur.right);
                }
            }
            bfs.add(subLevel);
        }
        return bfs;
    }

}
