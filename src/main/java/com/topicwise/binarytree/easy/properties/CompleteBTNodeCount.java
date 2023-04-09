package com.topicwise.binarytree.easy.properties;

import com.topicwise.binarytree.Node;

public class CompleteBTNodeCount {
    public static  int naiveNodeCount(Node root)
    {
        if(root == null)
            return 0;
        return 1+naiveNodeCount(root.left)+naiveNodeCount(root.right);
    }

    public static double efficientNodeCount(Node root)
    {
        if(root == null)
            return 0;
        int lh=0,rh=0;
        Node cur = root;
        while(cur!=null)
        {
            lh ++;
            cur = cur.left;
        }
        while(cur!=null)
        {
            rh ++;
            cur = cur.right;
        }
        if(lh == rh)
            return (Math.pow(2,lh)-1);
        else
            return 1 + efficientNodeCount(root.left) + efficientNodeCount(root.right);
    }
}
