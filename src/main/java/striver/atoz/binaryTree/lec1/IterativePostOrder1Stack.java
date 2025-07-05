package striver.atoz.binaryTree.lec1;

import striver.atoz.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePostOrder1Stack {
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> preOrder = iterativePostOrder1Stack(root);
        System.out.println(preOrder);
    }

    // Left Right Left
    private static List<Integer> iterativePostOrder1Stack(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(node != null || !stack.isEmpty()) {
            if(node != null) {
                stack.push(node);
                node = node.left;
            }
            else {
                TreeNode right = stack.peek().right;
                if(right == null) {
                    TreeNode temp = stack.pop();
                    result.add(temp.data);
                    while(!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        result.add(temp.data);
                    }
                }
                else {
                    node = right;
                }
            }
        }

        return result;
    }
}
