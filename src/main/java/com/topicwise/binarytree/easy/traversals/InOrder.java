package com.topicwise.binarytree.easy.traversals;

import com.topicwise.binarytree.Node;
/**
 *
 * @author ashwini.s
 */
public class InOrder {
    //Left Root Right
    public static  void inOrder(Node root)
    {
        if(root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
}
