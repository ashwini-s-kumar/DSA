package com.topicwise.binarytree.easy.properties;

import com.topicwise.binarytree.Node;
/**
 *
 * @author ashwini.s
 */
public class ChildSumProperty {
    public static Boolean childSumProperty(Node root)
    {
        if(root == null)
            return true;
        if(root.left == null && root.right == null)
            return true;
        int sum =0;
        if(root.left != null)
            sum+=root.left.data;
        if(root.right != null)
            sum+=root.right.data;
        if(root.data == sum && childSumProperty(root.left) && childSumProperty(root.right))
            return true;
        return false;
    }
}
