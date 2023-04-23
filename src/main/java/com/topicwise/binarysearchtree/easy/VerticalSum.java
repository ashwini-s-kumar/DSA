package com.topicwise.binarysearchtree.easy;


import com.topicwise.binarysearchtree.BinarySearchTree;
import com.topicwise.binarytree.BinaryTree;
import com.topicwise.binarytree.Node;
import com.topicwise.binarytree.NodeHD;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalSum {
    public static void  verticalSum(NodeHD root)
    {
        Map<Integer,Integer> hdSums = new TreeMap<>();
        Queue<NodeHD> queue = new ArrayDeque<>();

        int hd = 0;
        root.hd = hd;
        queue.add(root);
        while(!queue.isEmpty())
        {
            NodeHD cur = queue.poll();
            hd  = cur.hd;

            if(hdSums.containsKey(hd))
            {
                int sum = hdSums.get(hd) + cur.data;
                hdSums.put(hd , sum);
            }
            else
                hdSums.put(hd , cur.data);

            if(cur.left != null)
            {
                cur.left.hd = cur.hd -1;
                queue.add(cur.left);
            }
            if(cur.right != null)
            {
                cur.right.hd = cur.hd +1;
                queue.add(cur.right);
            }
        }

        System.out.println(hdSums);
    }

    public static void main(String [] arr){
        NodeHD simpleBST = BinaryTree.getSimpleBinaryBTwithHD();
        verticalSum(simpleBST);
    }
}
