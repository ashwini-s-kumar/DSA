package com.topicwise.binarysearchtree.easy;

import com.topicwise.binarysearchtree.BinarySearchTree;
import com.topicwise.binarytree.Node;

import java.util.HashSet;
import java.util.Set;

public class PairSumInBST {
    //InOrder traversal
    public static boolean isPair(Node root, int sum, Set<Integer> set) {
        if (root == null) {
            return false;
        }
        if (isPair(root.left, sum, set)) {
            return true;
        }
        if (set.contains(sum - root.data)) {
            return true;
        } else {
            set.add(root.data);
        }
        return isPair(root.right, sum, set);
    }

    public static void main(String [] arr){
        Node simpleBST = BinarySearchTree.getSimpleBST();
        System.out.println(isPair(simpleBST, 50, new HashSet<>()));
        System.out.println(isPair(simpleBST, 12, new HashSet<>()));
    }
}
