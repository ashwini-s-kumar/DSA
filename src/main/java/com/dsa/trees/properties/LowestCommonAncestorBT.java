package com.dsa.trees.properties;

import com.dsa.trees.Node;
/**
 *
 * @author ashwini.s
 */
public class LowestCommonAncestorBT {
    public static Node lCA(Node root, int n1, int n2)
    {
        if(root == null)
            return null;
        if(root.data == n1 || root.data == n2)
            return root;
        Node lCA_left = lCA(root.left,n1,n2);
        Node lCA_right = lCA(root.right, n1,n2);
        if(lCA_left != null && lCA_right != null)
            return root;
        return lCA_left != null ? lCA_left : lCA_right;
    }
}
