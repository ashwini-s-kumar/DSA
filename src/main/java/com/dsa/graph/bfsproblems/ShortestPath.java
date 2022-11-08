package com.dsa.graph.bfsproblems;

import com.dsa.graph.AdjacentListGraph;
import com.dsa.graph.BFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class ShortestPath {
    static void printDistance(ArrayList<ArrayList<Integer>> adj, int v, int source)
    {
        Queue<Integer> q = new ArrayDeque();
        boolean  [] visited = new boolean[v+1];
        int [] dist = new int[v+1];

        q.add(source);
        dist[source] = 0;
        visited[source] = true;

        while(!q.isEmpty())
        {
            int cur = q.poll();
            System.out.print(" " + cur +"-"+dist[cur]+" ");

            for(int x : adj.get(cur))
            {
                if(visited[x] == false)
                {
                    dist[x] = dist[cur] + 1;
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
