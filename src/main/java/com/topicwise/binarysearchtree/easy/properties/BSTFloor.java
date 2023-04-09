package com.topicwise.binarysearchtree.easy.properties;

import com.topicwise.binarytree.Node;
/**
 *
 * @author ashwini.s
 */
public class BSTFloor {
    public static Node floor(Node root, int key)
    {
        Node res = null;
        while(root != null)
        {
            if(root.data == key)
                return root;
            if(root.data > key)
                root = root.left;
            else{
                res = root;
                root = root.right;
            }
        }
        return res;
    }
}
