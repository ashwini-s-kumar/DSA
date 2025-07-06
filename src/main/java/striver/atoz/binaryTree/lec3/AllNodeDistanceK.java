package striver.atoz.binaryTree.lec3;

import striver.atoz.binaryTree.TreeNode;

import java.util.*;

public class AllNodeDistanceK {
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        List<Integer> result = allNodeDistanceK(root, 2, root.left);
        System.out.println(result);
    }


    private static List<Integer> allNodeDistanceK(TreeNode root, int distanceK, TreeNode targetNode) {
        List<Integer> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        HashMap<TreeNode, TreeNode> parentPointer = createParentPointer(root);
        HashMap<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new ArrayDeque<>();

        queue.add(targetNode);
        visited.put(targetNode, true);
        int curDistance = 0;
        while(!queue.isEmpty()) {
            if(curDistance == distanceK) {
                break;
            }
            curDistance ++;
            int size = queue.size();
            for(int i =0; i < size; i++) {
                TreeNode cur = queue.poll();
                // travel down
                if (cur.left != null && visited.get(cur.left) == null) {
                    queue.add(cur.left);
                    visited.put(cur.left, true);
                }
                if (cur.right != null && visited.get(cur.right) == null) {
                    queue.add(cur.right);
                    visited.put(cur.right, true);
                }
                // travel up
                if (parentPointer.get(cur) != null && visited.get(parentPointer.get(cur)) == null) {
                    queue.add(parentPointer.get(cur));
                    visited.put(parentPointer.get(cur), true);
                }
            }
        }
        while(!queue.isEmpty()) {
            result.add(queue.poll().data);
        }

        return result;
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
