package com.topicwise.graph.directed;

import com.topicwise.graph.AdjacentListGraph;

import java.util.ArrayList;

public class DfsCycleDetection {
    static boolean detectCycle(ArrayList<ArrayList<Integer>> adj, boolean [] visited, boolean [] recursionStack, int source)
    {

        recursionStack[source] = true;
        visited[source] = true;
        for(int x: adj.get(source))
        {
            if(visited[x] == false)
            {
                if(detectCycle(adj, visited, recursionStack, x))
                    return true;
            }
            else if(recursionStack[x] == true)
                return true;
        }
        recursionStack[source] = false;
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
        //AdjacentListGraph.insertEdge(adj, 5, 6);
        System.out.println(adj.toString());
        System.out.println(" ");

        boolean [] visited = new boolean[v];
        boolean [] recursionStack = new boolean[v];

        for(int i=0; i<v; i++) {
            if(visited[i] == false) {
                if (detectCycle(adj, visited, recursionStack, i)) {
                    System.out.println("Cycle detected");
                    return;
                }
            }
        }
        System.out.println("Cycle not detected");
    }
}
