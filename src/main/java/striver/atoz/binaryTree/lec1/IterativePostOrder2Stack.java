package striver.atoz.binaryTree.lec1;

import striver.atoz.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePostOrder2Stack {
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> preOrder = iterativePostOrder2Stack(root);
        System.out.println(preOrder);
    }

    // Left Right Left
    private static List<Integer> iterativePostOrder2Stack(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.add(node);
        while(!st1.isEmpty()) {
            TreeNode cur = st1.pop();
            st2.add(cur);
            if(cur.left != null) {
                st1.add(cur.left);
            }
            if(cur.right != null) {
                st1.add(cur.right);
            }
        }
        while(!st2.isEmpty()) {
            result.add(st2.pop().data);
        }

        return result;
    }
}
