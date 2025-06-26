package striver.atoz.binaryTree.lec1;

import striver.atoz.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllDfsTraversal {

    class Pair {
        TreeNode node;
        int num;
        public Pair(TreeNode node, int num) {
            this.node = node;
            this.num = num;
        }
    }

    private static List<Integer> pre = new ArrayList<>();
    private static List<Integer> in = new ArrayList<>();
    private static List<Integer> post = new ArrayList<>();
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        AllDfsTraversal obj = new AllDfsTraversal();
        obj.allDfsTraversal(root);

        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }

    void allDfsTraversal(TreeNode node) {
        if(node == null) {
            return;
        }
        Stack<Pair> stack = new Stack<>();
        stack.add(new Pair(node, 1));

        while(!stack.isEmpty()) {
            Pair it = stack.pop();
            if(it.num == 1){
                pre.add(it.node.data);
                it.num ++;
                stack.add(it);

                if(it.node.left != null) {
                    stack.add(new Pair(it.node.left, 1));
                }
            }
            else if(it.num == 2) {
                in.add(it.node.data);
                it.num ++;
                stack.add(it);

                if(it.node.right != null) {
                    stack.add(new Pair(it.node.right, 1));
                }
            }
            else {
                post.add(it.node.data);
            }
        }
    }
}
