package com.topicwise.binarysearchtree.easy.operations;

import com.topicwise.binarytree.Node;
/**
 *
 * @author ashwini.s
 */
public class DeleteNodeFromBST {
    public static Node getSuccessor(Node root)
    {
        Node cur = root.right;
        while(cur != null && cur.left != null)
            cur = cur.left;
        return cur;
    }
    public static Node deleteNodeFromBST(Node root, int key)
    {
        if(root == null)
            return null;
        if(key < root.data)
            root.left = deleteNodeFromBST(root.left , key);
        else if(key > root.data)
            root.right = deleteNodeFromBST(root.right , key);
        else {//key == root.data
            if (root.left == null) // one child
                return root.right;
            else if (root.right == null) // one child
                return root.left;
            else {
                Node succ = getSuccessor(root); // two childs
                root.data = succ.data;
                root.right = deleteNodeFromBST(root.right, succ.data);
            }
        }
        return root;
    }
}
