package com.topicwise.binarytree.easy.views;

import com.topicwise.binarytree.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author ashwini.s
 */
public class ZigZagViewReverseMethod {
    public static void spiralView(Node root){
        if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        boolean reverse=false;
        q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            System.out.println(" ");
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