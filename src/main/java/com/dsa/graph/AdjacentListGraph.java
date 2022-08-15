package com.dsa.graph;

import java.util.ArrayList;

public class AdjacentListGraph {
    public static void insertEdge(ArrayList<ArrayList<Integer>> adj, int v, int u)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String [] arrs)
    {
        int v = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for( int i =0 ; i < v; i++)
        {
            adj.add(new ArrayList<>());
        }
        /*
        0 - 1 - 3
        |   |
          2
         */
        insertEdge(adj, 0, 1);
        insertEdge(adj, 0, 2);
        insertEdge(adj, 1, 2);
        insertEdge(adj, 1, 3);
        System.out.println(adj.toString());
    }
}
