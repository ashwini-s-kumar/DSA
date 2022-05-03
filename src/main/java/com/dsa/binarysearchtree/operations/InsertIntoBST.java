package com.dsa.binarysearchtree.operations;

import com.dsa.binarytree.Node;
/**
 *
 * @author ashwini.s
 */
public class InsertIntoBST {
    public static Node insertIntoBST(Node root , int key)
    {
        if(root == null) {
             root = new Node(key);
             return root;
        }
        if(key < root.data)
            root.left = insertIntoBST(root.left,key);
        if(key > root.data)
            root.right = insertIntoBST(root.right,key);
        return root;
    }
}
