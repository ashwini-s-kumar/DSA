package striver.atoz.binaryTree.lec1;

import striver.atoz.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePreOrder1Stack {
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> preOrder = preOrderIterative(root);
        System.out.println(preOrder);
    }

    private static List<Integer> preOrderIterative(TreeNode node) {
        List<Integer> preOrder = new ArrayList<>();
        if(node == null){
            return preOrder;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(node);
        while(!stack.isEmpty()) {
            node = stack.pop();
            preOrder.add(node.data);
            if(node.right != null) {
                stack.add(node.right);
            }
            if(node.left != null) {
                stack.add(node.left);
            }
        }
        return preOrder;
    }

}
