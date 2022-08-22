package com.dsa.binarytree.views;

import com.dsa.binarytree.NodeHD;

import java.util.*;

public class BottomView {
    public static void bottomView(NodeHD root)
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
