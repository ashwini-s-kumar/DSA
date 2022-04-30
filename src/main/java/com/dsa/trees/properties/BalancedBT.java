package com.dsa.trees.properties;

import com.dsa.trees.HeightBt;
import com.dsa.trees.Node;
/**
 *
 * @author ashwini.s
 */
public class BalancedBT {
    // diff of height between left and right subtree should be <=1
    public static Boolean isBalancedBT(Node root)
    {
        if(root == null)
            return true;
        int lH= HeightBt.heightBt(root.left);
        int rH = HeightBt.heightBt(root.right);
        if(Math.abs(lH-rH)<=1 && isBalancedBT(root.left) && isBalancedBT(root.right))
            return true;
        else
            return false;
    }


}
