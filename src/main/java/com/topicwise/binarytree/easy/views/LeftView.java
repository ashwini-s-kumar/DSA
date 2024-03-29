package com.topicwise.binarytree.easy.views;

import com.topicwise.binarytree.BinaryTree;
import com.topicwise.binarytree.Node;

import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author ashwini.s
 */
public class LeftView {

    public static void simpleLeftView(Node root) {
        if(root == null){
            return;
        }
        System.out.println(root.data);
        simpleLeftView(root.left);
    }
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

    public static void main(String [] arr){
        System.out.println("");
        System.out.println("LeftView traversal of simpleBinaryBT:");
        LeftView.simpleLeftView(BinaryTree.getChildSumPropertyBT());

        System.out.println("=========================================");
        LeftView.leftView(BinaryTree.getChildSumPropertyBT());

    }
}
