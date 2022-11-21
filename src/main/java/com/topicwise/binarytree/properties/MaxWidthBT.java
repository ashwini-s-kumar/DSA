package com.topicwise.binarytree.properties;

import com.topicwise.binarytree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthBT {
    public static int maxWidthBT(Node root)
    {
        if(root == null)
            return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int maxWidth =0;
        while(!q.isEmpty())
        {
            int count = q.size();
            maxWidth= Math.max(maxWidth,count);
            for(int i=0;i<count;i++) {
                Node cur = q.poll();
                if (cur.left != null)
                    q.add(cur.left);
                if (cur.right != null)
                    q.add(cur.right);
            }
        }
        return maxWidth;
    }
}
