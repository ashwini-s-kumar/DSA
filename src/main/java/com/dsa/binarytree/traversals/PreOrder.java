package com.dsa.binarytree.traversals;

import com.dsa.binarytree.Node;
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
