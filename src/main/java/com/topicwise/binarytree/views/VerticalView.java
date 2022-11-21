package com.topicwise.binarytree.views;

import com.topicwise.binarytree.NodeHD;

import java.util.*;

public class VerticalView {
    public static void verticalView(NodeHD root)
    {
        if(root == null)
            return;
        Map<Integer,ArrayList<Integer>> hdToNodeData = new TreeMap<>();
        Queue<NodeHD> queue = new ArrayDeque<>();

        int hd = 0;
        root.hd = hd;
        queue.add(root);
        while (!queue.isEmpty())
        {
            NodeHD cur = queue.poll();
            int data = cur.data;
            hd = cur.hd;
            ArrayList<Integer> verticalNodes = hdToNodeData.get(hd);
            if(verticalNodes == null)
            {
                verticalNodes = new ArrayList<>();
                verticalNodes.add(data);
            }
            else
                verticalNodes.add(data);
            hdToNodeData.put(hd,verticalNodes);
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
        Iterator<Map.Entry<Integer,ArrayList<Integer>>> itr1 = hdToNodeData.entrySet().iterator();
        while(itr1.hasNext())
        {
            Map.Entry<Integer,ArrayList<Integer>> entry = itr1.next();
            for(Integer x : entry.getValue())
                System.out.print(" " + x +" ");
            System.out.println(" " +" ");
        }
    }
}
