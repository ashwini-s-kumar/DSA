package com.dsa.trees.traversals;

import com.dsa.trees.Node;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SpiralView {
    /*public static void spiralView(Node root)
    {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        q.add(root);
        boolean reverse = false;
        while(q.isEmpty() == false)
        {
            int count = q.size();
            for(int i=0;i<count;i++) {
                Node cur = q.poll();
                if (reverse)
                    s.add(cur.data);
                else
                    System.out.print(cur.data + " ");
                if (cur.left != null)
                    q.add(cur.left);
                if (cur.right != null)
                    q.add(cur.right);
            }
            if(reverse)
                while(s.isEmpty() == false)
                    System.out.print(s.pop()+" ");
            reverse=!reverse;
            System.out.println(" ");
        }
    }*/
    public static void spiralView(Node root){
        if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        boolean reverse=false;
        q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(reverse)
                    s.add(curr.data);
                else
                    System.out.print(curr.data+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            if(reverse){
                while(s.isEmpty()==false){
                    System.out.print(s.pop()+" ");
                }
            }
            reverse=!reverse;
        }
    }
}
