package com.dsa.trees.views;

import com.dsa.trees.Node;

import java.util.Stack;

/**
 *
 * @author ashwini.s
 */
public class SpiralViewTwoStackMethod {
    public static void spiralView(Node root){
        if(root==null)return;
        Stack<Node> s1=new Stack<>(); // left to right
        Stack<Node> s2=new Stack<>(); // right to left
        boolean reverse=false;
        s1.add(root);
        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty())
            {
                Node cur = s1.pop();
                System.out.print(cur.data + " ");
                if(cur.left != null)
                    s2.add(cur.left);
                if(cur.right != null)
                    s2.add(cur.right);
            }
            System.out.println(" ");
            while(!s2.isEmpty())
            {
                Node cur = s2.pop();
                System.out.print(cur.data + " ");
                if(cur.right != null)
                    s1.add(cur.right);
                if(cur.left != null)
                    s1.add(cur.left);
            }
            System.out.println(" ");
        }
    }
}
