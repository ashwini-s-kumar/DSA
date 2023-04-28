package com.topicwise.binarysearchtree.easy;

import com.topicwise.binarysearchtree.BinarySearchTree;
import com.topicwise.binarytree.Node;
import com.topicwise.binarytree.easy.traversals.LevelOrderLineWise;

/**
 *
 * @author ashwini.s
 */
public class BSTCeil {
    public static Node ceil(Node root, int key)
    {
        Node res = null;
        while(root != null){
            if(root.data == key)
                return root;
            if(root.data > key)
            {
                res= root;
                root = root.left;
            }
            else {
                root = root.right;
            }
        }
        return res;
    }
    public static void main(String [] arr){
        Node simpleBST = BinarySearchTree.getSimpleBST();
        System.out.println("");
        System.out.println("floor of  44  in simpleBST : " + ceil(simpleBST,44).data );

    }
}
