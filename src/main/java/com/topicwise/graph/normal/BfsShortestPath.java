package com.topicwise.graph.normal;

import com.topicwise.graph.AdjacentListGraph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BfsShortestPath {
    static void printDistance(ArrayList<ArrayList<Integer>> adj, int V , int source)
    {
        Queue<Integer> q = new ArrayDeque();
        boolean  [] visited = new boolean[V+1];
        int [] dist = new int[V+1];

        q.add(source);
        dist[source] = 0;
        visited[source] = true;

        while(!q.isEmpty())
        {
            int u = q.poll();
            System.out.print(" " + u +"-"+dist[u]+" ");

            for(int x : adj.get(u))
            {
                if(visited[x] == false)
                {
                    dist[x] = dist[u] + 1;
                    visited[x] = true;
                    q.add(x);
                }
            }

        }
        System.out.println(" ");
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
        System.out.println(" ");
        printDistance(adj, 7, 0);

    }
}
