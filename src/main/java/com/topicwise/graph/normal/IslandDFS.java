package com.topicwise.graph.normal;

import com.topicwise.graph.AdjacentListGraph;

import java.util.ArrayList;

public class IslandDFS {
    static int v = 7;
    static boolean [] visited = new boolean[v];

    public static void dfs(ArrayList<ArrayList<Integer>>adj, int s){
        visited[s] = true;
        System.out.print(s + " ");
        for(int i : adj.get(s))
        {
            if(visited[i] == false)
                dfs(adj, i);
        }
    }
    public static void main(String [] arrs)
    {
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
        for(int i = 0; i < v; i++)
        {
            if(visited[i] == false) {
                dfs(adj, i);
                countIslands++;
            }
        }
        System.out.println("No of islands :"+countIslands);
    }
}
