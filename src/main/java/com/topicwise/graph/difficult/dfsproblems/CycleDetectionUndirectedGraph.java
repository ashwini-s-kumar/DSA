package com.topicwise.graph.difficult.dfsproblems;

import com.topicwise.graph.AdjacentListGraph;

import java.util.ArrayList;

public class CycleDetectionUndirectedGraph {
    static boolean detectCycle(ArrayList<ArrayList<Integer>> adj, int source, boolean [] visited, int parent)
    {
        visited[source] = true;
        for(int x: adj.get(source))
        {
            if(visited[x] == false) {
                if(detectCycle(adj, x, visited,source) == true) {
                    return true;
                }
            }
            else if(x != parent) {
                return true;
            }
        }
        return false;
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

        boolean [] visited = new boolean[v+1];

        for(int i=0; i<v; i++) {
            if(visited[i] == false) {
                if (detectCycle(adj, i, visited, -1)) {
                    System.out.println("Cycle detected");
                    return;
                }
            }
        }
        System.out.println("Cycle not detected");
    }
}
