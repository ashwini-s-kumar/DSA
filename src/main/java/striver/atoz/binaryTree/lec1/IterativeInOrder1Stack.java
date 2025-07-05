package striver.atoz.binaryTree.lec1;

import striver.atoz.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeInOrder1Stack {
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> preOrder = iterativeInOrder(root);
        System.out.println(preOrder);
    }

    // left root right
    private static List<Integer> iterativeInOrder(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(node == null) {
            return result;
        }
        while(true) {
            if(node != null) {
                stack.add(node);
                node = node.left;
            }
            else {
                if(stack.isEmpty()) {
                    break;
                }
                node = stack.pop();
                result.add(node.data);
                node = node.right;
            }
        }
        return  result;
    }
}
