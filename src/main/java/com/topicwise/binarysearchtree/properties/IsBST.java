package com.topicwise.binarysearchtree.properties;

import com.topicwise.binarytree.Node;

public class IsBST {
    // the BT is BST , if in the inorder traversal is in increasing order.
    /*
                       50
                   20        60
                5     30  55    70
           InOrder : 5 20  30 50 55 60 70

     */
    Node prev = null;
    public boolean isBstInorder(Node root)
    {
        if(root == null)
            return true;
        else if(!isBstInorder(root.left))
            return false;
        if(prev != null && root.data <= prev.data )
            return false;
        prev = root;
        return  isBstInorder(root.right);
    }

    public boolean isBst(Node root, Node l, Node r)
    {
        if(root == null)
            return true;
        if(l == null || root.data >= l.data)
            return false;
        else if(r == null || root.data <= r.data)
            return false;
        return isBst(root.left, l, root) && isBst(root.right, root, r);
    }
}
