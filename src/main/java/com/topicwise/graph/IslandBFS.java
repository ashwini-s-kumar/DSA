package com.topicwise.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class IslandBFS {
    public static void bfs(ArrayList<ArrayList<Integer>>adj, boolean [] visited, int s)
    {
        Queue<Integer>q = new ArrayDeque<>();
        q.add(s);
        visited[s] = true;
        while(!q.isEmpty())
        {
            int cur = q.poll();
            for(int i : adj.get(cur)) {
                if (visited[i] == false) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
    public static void main(String [] arrs)
    {
        int v = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for( int i = 0 ; i < v; i++)
        {
            adj.add(new ArrayList<>());
        }
        /*
        0 - 1 - 3
        |   |
          2
         */
        AdjacentListGraph.insertEdge(adj, 0, 1);
        AdjacentListGraph.insertEdge(adj, 0, 4);
        AdjacentListGraph.insertEdge(adj, 1, 2);
        AdjacentListGraph.insertEdge(adj, 2, 3);
        AdjacentListGraph.insertEdge(adj, 4, 5);
        AdjacentListGraph.insertEdge(adj, 4, 6);
        AdjacentListGraph.insertEdge(adj, 5, 6);
        System.out.println(adj.toString());

        int countIslands = 0;
        boolean [] visited = new boolean[v+1];
        for(int i = 0; i < v; i++)
        {
            if(visited[i] == false)
            {
                countIslands++;
                bfs(adj,visited,i);
            }
        }
        System.out.println("no of islands :"+countIslands);
    }
}
