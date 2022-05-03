package com.dsa.binarytree.properties;

import com.dsa.binarytree.Node;

/**
 *
 * @author ashwini.s
 */
public class MaxOfBT {
    public static int maxOfBT(Node root)
    {
        if(root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(maxOfBT(root.left),maxOfBT(root.right)));
    }
}
