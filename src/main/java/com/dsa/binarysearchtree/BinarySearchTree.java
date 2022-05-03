package com.dsa.binarysearchtree;

import com.dsa.binarytree.Node;
/**
 *
 * @author ashwini.s
 */
public class BinarySearchTree {
    /*
                         60
                30               70
           20      45         65     80
        10      40     50

     */
    public static Node getSimpleBST()
    {
        Node root = new Node(60);
        root.left = new Node(30);
        root.left.left = new Node(20);
        root.left.right = new Node(45);
        root.left.left.left = new Node(10);
        root.left.right.left = new Node(40);
        root.left.right.right = new Node(50);

        root.right = new Node(70);
        root.right.left = new Node(65);
        root.right.right = new Node(80);

        return root;
    }
}
