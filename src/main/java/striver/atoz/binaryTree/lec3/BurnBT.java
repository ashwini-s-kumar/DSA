package striver.atoz.binaryTree.lec3;

import striver.atoz.binaryTree.TreeNode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class BurnBT {
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(7);

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        int maxTime = burnBT(root, root.left);
        System.out.println(maxTime);
    }

    private static int burnBT(TreeNode root, TreeNode targetNode) {
        if(root == null) {
            return 0;
        }
        HashMap<TreeNode, TreeNode> parentPointer = createParentPointer(root);
        HashMap<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        int maxTime = 0;
        queue.add(targetNode);
        visited.put(targetNode, true);
        while(!queue.isEmpty()) {
            int burn = 0;
            int size = queue.size();
            for(int i =0; i < size; i++) {
                TreeNode cur = queue.poll();
                // travel down
                if (cur.left != null && visited.get(cur.left) == null) {
                    burn = 1;
                    queue.add(cur.left);
                    visited.put(cur.left, true);
                }
                if (cur.right != null && visited.get(cur.right) == null) {
                    burn = 1;
                    queue.add(cur.right);
                    visited.put(cur.right, true);
                }
                // travel up
                if (parentPointer.get(cur) != null && visited.get(parentPointer.get(cur)) == null) {
                    burn = 1;
                    queue.add(parentPointer.get(cur));
                    visited.put(parentPointer.get(cur), true);
                }
            }
            if(burn == 1) {
                maxTime += 1;
            }
        }
        return maxTime;
    }

    private static HashMap<TreeNode, TreeNode> createParentPointer(TreeNode root) {
        HashMap<TreeNode, TreeNode> parentPointer = new HashMap<>();
        if(root == null) {
            return parentPointer;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        parentPointer.put(root, null);
        while(!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if(cur.left != null) {
                queue.add(cur.left);
                parentPointer.put(cur.left, cur);
            }
            if(cur.right != null) {
                queue.add(cur.right);
                parentPointer.put(cur.right, cur);
            }
        }

        return parentPointer;
    }
}
