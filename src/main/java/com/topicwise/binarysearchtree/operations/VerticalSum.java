package com.topicwise.binarysearchtree.operations;


import com.topicwise.binarytree.NodeHD;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalSum {
    public void  verticalSum(NodeHD root)
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
        for(Map.Entry<Integer,Integer> entry : hdSums.entrySet())
        {
            System.out.println(entry.getValue() + " ");
        }
    }
}
