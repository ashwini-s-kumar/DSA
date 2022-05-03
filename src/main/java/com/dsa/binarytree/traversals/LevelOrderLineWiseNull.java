package com.dsa.binarytree.traversals;

import com.dsa.binarytree.Node;

import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author ashwini.s
 */
public class LevelOrderLineWiseNull {
    public static void levelOrderLineWiseNull(Node root)
    {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node cur = q.poll();
            if(cur == null)
            {
                if(!q.isEmpty()) {
                    System.out.println(" ");
                    q.add(null);
                }
            }
            else
            {
                System.out.print(cur.data + " ");
                if(cur.left != null)
                    q.add(cur.left);
                if(cur.right != null)
                    q.add(cur.right);
            }
        }
    }
}
