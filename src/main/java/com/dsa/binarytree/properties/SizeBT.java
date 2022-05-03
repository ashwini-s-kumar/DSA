package com.dsa.binarytree.properties;

import com.dsa.binarytree.Node;

/**
 *
 * @author ashwini.s
 */
public class SizeBT {
    public static int sizeBT(Node root)
    {
        if(root == null)
            return 0;
        return 1+ sizeBT(root.left) + sizeBT(root.right);
    }
}
