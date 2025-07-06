package striver.atoz.binaryTree.lec3;

import striver.atoz.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class NodePath {
    private static List<Integer> path = new ArrayList<>();
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

        nodePath(root, path, 6);
        System.out.println(path);
    }

    private static boolean nodePath(TreeNode node, List<Integer> path, int targetNodeValue) {
        if(node == null) {
            return false;
        }
        path.add(node.data);
        if(node.data == targetNodeValue) {
            return true;
        }
        if(nodePath(node.left, path, targetNodeValue) || nodePath(node.right, path, targetNodeValue)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }
}
