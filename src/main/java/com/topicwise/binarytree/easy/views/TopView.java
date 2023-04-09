package com.topicwise.binarytree.easy.views;

import com.topicwise.binarytree.NodeHD;

import java.util.*;

public class TopView {
    public static void topView(NodeHD root)
    {
        if(root == null)
            return;
        Map<Integer,Integer> hdToNodeData = new TreeMap<>();
        Queue<NodeHD> queue = new ArrayDeque<>();

        int hd = 0;
        root.hd = hd;
        queue.add(root);
        while (!queue.isEmpty())
        {
            NodeHD cur = queue.poll();
            int data = cur.data;
            hd = cur.hd;
            if(!hdToNodeData.containsKey(hd))
                hdToNodeData.put(hd,data);
            if(cur.left != null)
            {
                cur.left.hd = hd - 1;
                queue.add(cur.left);
            }
            if(cur.right != null)
            {
                cur.right.hd = hd + 1;
                queue.add(cur.right);
            }
        }
        Iterator<Map.Entry<Integer,Integer>> itr1 = hdToNodeData.entrySet().iterator();
        while(itr1.hasNext())
        {
            Map.Entry<Integer,Integer> entry = itr1.next();
            System.out.print(" " + entry.getValue() +" ");
        }
    }
}
