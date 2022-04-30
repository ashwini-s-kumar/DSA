package com.dsa.trees.traversals;

import com.dsa.trees.Node;
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
