package com.topicwise.graph.normal;

import com.topicwise.graph.AdjacentListGraph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFS {
    public static void printBFS(ArrayList<ArrayList<Integer>>adj,int v, int s)
    {
        boolean [] visited = new boolean[v];
        Queue<Integer> q = new ArrayDeque<>();
        q.add(s);
        visited[s] = true;
        while(!q.isEmpty())
        {
            int cur = q.poll();
            System.out.print(cur +" ");
            for(int x : adj.get(cur))
            {
                if(visited[x] == false)
                {
                    q.add(x);
                    visited[x] = true;
                }
            }
        }
    }
    public static void main(String [] arrs)
    {
        int  v = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for( int i = 0 ; i < v; i++)
        {
            adj.add(new ArrayList<>());
        }

        AdjacentListGraph.insertEdge(adj, 0, 1);
        AdjacentListGraph.insertEdge(adj, 0, 4);
        AdjacentListGraph.insertEdge(adj, 1, 2);
        AdjacentListGraph.insertEdge(adj, 2, 3);
        AdjacentListGraph.insertEdge(adj, 4, 5);
        AdjacentListGraph.insertEdge(adj, 4, 6);
        AdjacentListGraph.insertEdge(adj, 5, 6);
        System.out.println(adj.toString());
        printBFS(adj, 7, 0);

    }
}
