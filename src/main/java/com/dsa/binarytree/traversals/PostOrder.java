package com.dsa.binarytree.traversals;

import com.dsa.binarytree.Node;
/**
 *
 * @author ashwini.s
 */
public class PostOrder {
    // Left Right Root
    public static void postOrder(Node root)
    {
        if(root!=null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
}
