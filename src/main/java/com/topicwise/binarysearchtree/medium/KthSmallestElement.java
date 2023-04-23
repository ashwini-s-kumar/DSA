package com.topicwise.binarysearchtree.medium;

import com.topicwise.binarytree.BinaryTree;
import com.topicwise.binarytree.NodeLCount;

public class KthSmallestElement {

    public static int kthSmallest(NodeLCount root, int k){
        if(root == null){
            return -1;
        }
        int lCount = root.lCount + 1;
        if(lCount == k){
            return root.data;
        }

        else if(k < lCount){
            return kthSmallest(root.left, k);
        }

        return kthSmallest(root.right , k - lCount);
    }

    public static void main(String [] arr){
        NodeLCount root = BinaryTree.getAugmentedBST();
        System.out.println(kthSmallest(root, 3));
        System.out.println(kthSmallest(root, 13));
        System.out.println(kthSmallest(root, 7));
    }
}
