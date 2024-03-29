package com.topicwise.binarytree.easy.views;

import com.topicwise.binarytree.Node;
/**
 *
 * @author ashwini.s
 */
public class PrintKthLevel {
    public static void printKthLevel(Node root, int k)
    {
        if(root == null)
            return;
        if(k==0)
            System.out.print( root.data + " ");
        else
        {
            printKthLevel(root.left,k-1);
            printKthLevel(root.right,k-1);
        }
    }
}
