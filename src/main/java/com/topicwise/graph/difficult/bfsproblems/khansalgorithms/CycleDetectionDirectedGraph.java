package com.topicwise.graph.difficult.bfsproblems.khansalgorithms;

import com.topicwise.graph.AdjacentListGraph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class CycleDetectionDirectedGraph {
    public static void detectCycleDAG(ArrayList<ArrayList<Integer>> adjList, int v)
    {
        int [] indegree = new int[v];
        Queue<Integer> q = new ArrayDeque<>();

        for(int i = 0; i<v;i++)
        {
            indegree[i] =0;
        }
        for(int i = 0; i < adjList.size(); i++)
        {
            ArrayList<Integer> temp = adjList.get(i);
            for(int j : temp)
            {
                indegree[j]++;
            }
        }
        for(int i = 0; i<v;i++)
        {
            if(indegree[i] == 0)
            {
                q.add(i);
            }
        }

        int count = 0;
        while(!q.isEmpty())
        {
            int u = q.poll();
            count ++;
            //System.out.println(" "+u+" ");
            for(int i : adjList.get(u))
            {
                indegree[i] = indegree[i] - 1;
                if(indegree[i] == 0)
                {
                    q.add(i);
                }
            }
        }
        if(count != v)
        {
            System.out.println("A cycle is found");
        }
        else
        {
            System.out.println("A cycle is not found");
        }

    }


    public static void main(String [] arrs) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        AdjacentListGraph.insertEdgeDAG(adj, 0, 1);
        AdjacentListGraph.insertEdgeDAG(adj, 1, 2);
        AdjacentListGraph.insertEdgeDAG(adj, 3, 4);
        AdjacentListGraph.insertEdgeDAG(adj, 3, 2);
        AdjacentListGraph.insertEdgeDAG(adj, 2, 0);
        System.out.println(adj.toString());
        System.out.println(" ");

        detectCycleDAG(adj, v);
    }
}
