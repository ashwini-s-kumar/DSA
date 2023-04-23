package com.topicwise.binarysearchtree.easy;

import com.topicwise.binarysearchtree.BinarySearchTree;
import com.topicwise.binarytree.Node;

public class IsBST {
    // the BT is BST , if in the inorder traversal is in increasing order.
    /*
                       50
                   20        60
                5     30  55    70
           InOrder : 5 20  30 50 55 60 70

     */
    static Node prev = null;
    public static boolean isBstInorder(Node root)
    {
        if(root == null)
            return true;
        else if(!isBstInorder(root.left))
            return false;
        if(prev != null && root.data <= prev.data )
            return false;
        prev = root;
        return  isBstInorder(root.right);
    }

    public static void main(String  [] arr){
        Node simpleBST = BinarySearchTree.getSimpleBST();
        System.out.println(isBstInorder(simpleBST));
    }
}
