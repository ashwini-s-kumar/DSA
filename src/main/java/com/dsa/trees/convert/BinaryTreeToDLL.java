package com.dsa.trees.convert;

import com.dsa.trees.Node;

public class BinaryTreeToDLL {
    static Node prev = null , head = null;
    public static Node binaryTreeToDLL(Node root)
    {
        BTtoDLL(root);
        return head;
    }

    public static void BTtoDLL(Node root)
    {
        if(root == null)
            return;
        BTtoDLL(root.left);
        if(prev == null)
            head = root;
        else
        {
            root.left = prev;
            prev.right=root;
        }
        prev=root;
        BTtoDLL(root.right);
    }
}
