package com.topicwise.binarysearchtree.medium;

import com.topicwise.binarytree.BinaryTree;
import com.topicwise.binarytree.Node;
import com.topicwise.binarytree.easy.traversals.LevelOrderLineWise;

public class FixBST {
    private static Node prev, first , second = null;

    public static void fix(Node root){
        if(root == null){
            return;
        }
        fix(root.left);
        if(prev != null && root.data < prev.data){
            if(first == null){
                first = prev;
            }
            second = root;
        }
        prev = root;
        fix(root.right);
    }

    public static Node fixBst(Node root){
        fix(root);
        int temp = first.data;
        first.data = second.data;
        second.data = temp;

        return root;
    }

    public static void main(String [] arr){
        Node swappedBst = BinaryTree.getSwappedBST();
        System.out.println("Swappep BST : ");
        LevelOrderLineWise.levelOrderLineWise(swappedBst);

        swappedBst = fixBst(swappedBst);
        System.out.println("After fixing :" );
        LevelOrderLineWise.levelOrderLineWise(swappedBst);
    }
}
