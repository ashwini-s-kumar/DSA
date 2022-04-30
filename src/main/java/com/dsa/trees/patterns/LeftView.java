package com.dsa.trees.patterns;

import com.dsa.trees.Node;

import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author ashwini.s
 */
public class LeftView {
    public static void leftView(Node root)
    {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node cur = q.poll();
                if (i == 0)
                    System.out.print(cur.data + " ");
                if (cur.left != null)
                    q.add(cur.left);
                if (cur.right != null)
                    q.add(cur.right);
            }
            System.out.println(" ");
        }
    }
}
