package com.topicwise.binarytree.traversals;

import com.topicwise.binarytree.Node;
/**
 *
 * @author ashwini.s
 */
public class PreOrder {
    //Root Left Right
    public static void preOrder(Node root)
    {
        if(root!=null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
