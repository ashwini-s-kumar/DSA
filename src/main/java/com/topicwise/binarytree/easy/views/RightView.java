package com.topicwise.binarytree.easy.views;

import com.topicwise.binarytree.Node;

import java.util.ArrayDeque;
import java.util.Queue;
/**
 *
 * @author ashwini.s
 */
public class RightView {

    public static void simpleRightView(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        simpleRightView(root.right);
    }
    public static void rightView(Node root)
    {
        if(root == null)
            return;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty())
        {
         int count = q.size();
         for(int i=0;i<count;i++)
         {
             Node cur = q.poll();
             if(i == count-1)
                 System.out.println(cur.data);
             if(cur.left != null)
                 q.add(cur.left);
             if(cur.right != null)
                 q.add(cur.right);
         }
        }
    }
}
