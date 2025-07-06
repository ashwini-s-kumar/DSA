package striver.atoz.binaryTree.lec3;

import striver.atoz.binaryTree.Pair;
import striver.atoz.binaryTree.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class MaxWidthBT {
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(9);

        int maxWidth = findMaxWidthBT(root);
        System.out.println(maxWidth);
    }

    private static int findMaxWidthBT(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int width = 0;
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(root, 0));
        while(!queue.isEmpty()) {
            int mMin = queue.peek().num;
            int size = queue.size();
            int first = 0;
            int last = 0;
            for(int i = 0; i < size; i++) {
                Pair pair = queue.poll();
                int cur_Id = pair.num - mMin;;
                if( i == 0) {
                    first = cur_Id;
                }
                if(i == size-1) {
                    last = cur_Id;
                }
                if(pair.node.left != null) {
                    queue.add(new Pair(pair.node.left, 2 * cur_Id  + 1));
                }
                if(pair.node.right != null) {
                    queue.add(new Pair(pair.node.right, 2 * cur_Id  + 2));
                }
            }
            width = Math.max(width, last - first + 1);
        }
        return width;
    }

}
