package com.dsa.trees.traversals;

import com.dsa.trees.Node;
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
