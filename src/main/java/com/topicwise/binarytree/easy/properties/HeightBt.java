package com.topicwise.binarytree.easy.properties;

import com.topicwise.binarytree.Node;

/**
 *
 * @author ashwini.s
 */
public class HeightBt {
    public static int heightBt(Node root)
    {
        if(root == null)
            return 0;
        return 1 + Math.max(heightBt(root.left), heightBt(root.right));
    }
}
