package com.topicwise.graph.directedAcyclic;

import com.topicwise.graph.AdjacentListGraph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BfsKhansTopologicalSorting {
    public static void topologicalSort(ArrayList<ArrayList<Integer>> adjList, int v)
    {
        int [] indegree = new int[v];

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

        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0; i<v;i++)
        {
            if(indegree[i] == 0)
            {
                q.add(i);
            }
        }

        while(!q.isEmpty())
        {
            int u = q.poll();
            System.out.println(" "+u+" ");
            for(int i : adjList.get(u))
            {
                indegree[i] = indegree[i] - 1;
                if(indegree[i] == 0)
                {
                    q.add(i);
                }
            }
        }

    }


    public static void main(String [] arrs) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        AdjacentListGraph.insertEdgeDirected(adj, 0, 1);
        AdjacentListGraph.insertEdgeDirected(adj, 1, 2);
        AdjacentListGraph.insertEdgeDirected(adj, 3, 4);
        AdjacentListGraph.insertEdgeDirected(adj, 3, 2);
        System.out.println(adj.toString());
        System.out.println(" ");

        topologicalSort(adj, v);
    }
}
