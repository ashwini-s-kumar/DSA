package com.topicwise.binarysearchtree.easy;

import com.topicwise.binarysearchtree.BinarySearchTree;
import com.topicwise.binarytree.Node;
import com.topicwise.binarytree.easy.traversals.LevelOrderLineWise;

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

    public static void main(String [] arr){
        Node simpleBST = BinarySearchTree.getSimpleBST();
        System.out.println("");
        System.out.println("delete 60  into simpleBST : " );
        deleteNodeFromBST(simpleBST , 60);
        LevelOrderLineWise.levelOrderLineWise(simpleBST);
    }
}
