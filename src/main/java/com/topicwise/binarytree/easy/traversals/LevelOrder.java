package com.topicwise.binarytree.easy.traversals;

import com.topicwise.binarytree.Node;

import java.util.ArrayDeque;
import java.util.Queue;
/**
 *
 * @author ashwini.s
 */
public class LevelOrder {
    public static void levelOrder(Node root)
    {
        if(root == null)
            return;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()) {
            Node cur = q.poll();
            System.out.print(cur.data + " ");
            if(cur.left != null)
                q.add(cur.left);
            if(cur.right != null)
                q.add(cur.right);
        }
    }
}
