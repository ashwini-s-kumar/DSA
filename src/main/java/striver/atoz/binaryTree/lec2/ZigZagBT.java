package striver.atoz.binaryTree.lec2;

import striver.atoz.binaryTree.TreeNode;

import java.util.*;

public class ZigZagBT {
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        zigZagBT(root);
    }

    private static void zigZagBT(TreeNode root) {
        if(root == null) {
            return;
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        boolean flag = true;
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> subRes = new ArrayList<>();
            int index;
            for(int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                subRes.add( cur.data);
                if(cur.left != null) {
                    q.add(cur.left);
                }
                if(cur.right != null) {
                    q.add(cur.right);
                }
            }
            if(!flag) {
                Collections.reverse(subRes);
            }
            res.add(subRes);
            flag = !flag;
        }
        System.out.println(res);
    }
}
