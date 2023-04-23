package com.topicwise.binarysearchtree.easy;

import com.topicwise.binarysearchtree.BinarySearchTree;
import com.topicwise.binarytree.Node;
/**
 *
 * @author ashwini.s
 */
public class SearchBST {
    public static boolean searchBST(Node root, int key)
    {
        if(root == null)
            return false;
        if(root.data == key)
            return true;
        if(key < root.data)
            return searchBST(root.left,key);
        else
            return searchBST(root.right,key);
    }
    public static void main(String  [] arr){
        Node simpleBST = BinarySearchTree.getSimpleBST();

        System.out.println("");
        System.out.println("Search 60 in simpleBST : " + searchBST(simpleBST,60));

        System.out.println("");
        System.out.println("Search 90 in simpleBST : " + searchBST(simpleBST,90));

    }
}
