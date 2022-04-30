package com.dsa.trees;
/**
 *
 * @author ashwini.s
 */
public class BinaryTree {
    /*
             10
       2           15
    4      5     6     7
     */
    public static  Node getSimpleBinaryBT()
    {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        return root;
    }

    public static Node getChildSumPropertyBT()
    {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(3);
        root.left.right= new Node(5);
        return root;
    }
}
