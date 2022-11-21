package com.topicwise.binarytree.properties;

import com.topicwise.binarytree.Node;
/**
 *
 * @author ashwini.s
 */
public class DiameterBT {
    static int dia =0;
    /*The diameter of the binary tree is defined as
    the total number of nodes on the longest path between two end nodes*/
    public static  int diameterBT(Node root)
    {
        if(root == null)
            return 0;
        int lH = HeightBt.heightBt(root.left);
        int rH = HeightBt.heightBt(root.right);
        dia = Math.max(dia,(1+lH+rH));
        return dia;
    }
}
