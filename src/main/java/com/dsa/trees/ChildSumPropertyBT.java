package com.dsa.trees;

public class ChildSumPropertyBT {
    /*
            20
       8            12
    3      5
     */
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
