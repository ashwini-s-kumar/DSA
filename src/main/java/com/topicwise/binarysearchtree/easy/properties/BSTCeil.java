package com.topicwise.binarysearchtree.easy.properties;

import com.topicwise.binarytree.Node;
/**
 *
 * @author ashwini.s
 */
public class BSTCeil {
    public static Node ceil(Node root, int key)
    {
        Node res = null;
        while(root != null){
            if(root.data == key)
                return root;
            if(root.data > key)
            {
                res= root;
                root = root.left;
            }
            else
                root = root.right;
        }
        return res;
    }
}
