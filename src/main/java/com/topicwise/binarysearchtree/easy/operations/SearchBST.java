package com.topicwise.binarysearchtree.easy.operations;

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
}
