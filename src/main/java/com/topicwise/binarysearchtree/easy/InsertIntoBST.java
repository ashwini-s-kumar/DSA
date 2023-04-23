package com.topicwise.binarysearchtree.easy;

import com.topicwise.binarysearchtree.BinarySearchTree;
import com.topicwise.binarytree.Node;
import com.topicwise.binarytree.easy.traversals.LevelOrderLineWise;

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
    public static void main(String [] arr){
        Node simpleBST = BinarySearchTree.getSimpleBST();
        System.out.println("");
        System.out.println("Insert 25  into simpleBST : " );
        insertIntoBST(simpleBST , 25);
        LevelOrderLineWise.levelOrderLineWise(simpleBST);

    }
}
