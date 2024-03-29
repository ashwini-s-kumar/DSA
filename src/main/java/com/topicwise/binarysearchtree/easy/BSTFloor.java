package com.topicwise.binarysearchtree.easy;

import com.topicwise.binarysearchtree.BinarySearchTree;
import com.topicwise.binarytree.Node;
/**
 *
 * @author ashwini.s
 */
public class BSTFloor {
    public static Node floor(Node root, int key)
    {
        Node res = null;
        while(root != null) {
            if(root.data == key)
                return root;
            if(root.data > key)
                root = root.left;
            else{
                res = root;
                root = root.right;
            }
        }
        return res;
    }
    public static void main(String [] arr){
        Node simpleBST = BinarySearchTree.getSimpleBST();
        System.out.println("");
        System.out.println("floor of  44  in simpleBST : " + floor(simpleBST,44).data );

    }
}
