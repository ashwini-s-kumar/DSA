package com.topicwise.binarytree.operations;

import com.topicwise.binarytree.Node;

import java.util.*;

public class BurnBTFromTargetNode {
    static Map<Node, ArrayList<Node>> unDirectedGraph = new HashMap<>();
    static int burnTime = 0;
    public static int getBurnTimefromTargetNode(Node root, Node target)
    {
        buildGraph(root,null);
        if(!unDirectedGraph.isEmpty())
            burn(root,target);
        return burnTime;
    }
    static void buildGraph(Node node,Node parent)
    {
        if(node == null)
            return ;
        if(!unDirectedGraph.containsKey(node))
        {
            unDirectedGraph.put(node,new ArrayList<>());
            if(parent!= null)
            {
                unDirectedGraph.get(node).add(parent);
                unDirectedGraph.get(parent).add(node);
            }
            buildGraph(node.left,node);
            buildGraph(node.right,node);
        }
    }
    static void burn(Node root , Node target)
    {
        if(root == null)
            return;
        if(unDirectedGraph.containsKey(target)) {
            Queue<Node> q = new ArrayDeque<Node>();
            Set<Node> visited = new HashSet<>();
            q.add(target);
            visited.add(target);
            while(!q.isEmpty())
            {
                int count = q.size();
                burnTime+=1;
                for(int i=0;i<count;i++)
                {
                    Node cur = q.poll();
                    System.out.print(cur.data +" ");
                    for(Node connectedNode : unDirectedGraph.get(cur))
                    {
                        if(visited.contains(connectedNode))
                            continue;
                        q.add(connectedNode);
                        visited.add(connectedNode);
                    }
                }
                System.out.println("");
            }
        }
    }
}
