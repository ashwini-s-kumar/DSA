package com.topicwise.graph.weightedDirectedAcyclic;

import com.topicwise.array.PrintArray;
import com.topicwise.graph.AdjacentListGraph;

import java.util.ArrayList;
import java.util.Stack;

public class DfsTopologicalSortShortestPath {
    private static int v = 6;
    private static boolean [] visited = new boolean[v];

    private  static int [] dist = new int[v];

    private static Stack<Integer> stack = new Stack<>();

    public static void calculateDistance(ArrayList<ArrayList<Integer>> adj){
        while(!stack.isEmpty()){
            int u = stack.pop();
            if(dist[u] != Integer.MAX_VALUE){
                for(int v : adj.get(u)){
                    if(dist[v] > dist[u] + weight(u, v)){
                        dist[v] = dist[u] + weight(u, v);
                    }
                }
            }
        }
    }

    public static void findShortestPath(ArrayList<ArrayList<Integer>> adj){
        for(int i = 0; i < dist.length; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        for(int i = 0; i < v; i++){
            if(!visited[i]) {
                dist[i] = 0;
                dfs(adj, i);
            }
        }
        calculateDistance(adj);
        PrintArray.print(dist);
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj, int v){
        visited[v] = true;
        for(int u : adj.get(v)){
            if(!visited[u]){
                dfs(adj, u);
            }
        }
        stack.add(v);
    }

    public static void main(String [] arrs) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        AdjacentListGraph.insertEdgeDirected(adj, 0, 1);
        AdjacentListGraph.insertEdgeDirected(adj, 0, 2);
        AdjacentListGraph.insertEdgeDirected(adj, 1, 3);
        AdjacentListGraph.insertEdgeDirected(adj, 2, 3);
        AdjacentListGraph.insertEdgeDirected(adj, 2, 4);
        AdjacentListGraph.insertEdgeDirected(adj, 3, 4);
        AdjacentListGraph.insertEdgeDirected(adj, 3, 5);
        AdjacentListGraph.insertEdgeDirected(adj, 4, 5);
        System.out.println(adj.toString());
        System.out.println(" ");

        findShortestPath(adj);
    }

    private static int weight(int u, int v) {
        // return the weight of the edge (u, v)
        // or Integer.MAX_VALUE if the edge doesn't exist
        if (u == 0 && v == 1) return 2;
        if (u == 0 && v == 2) return 1;
        if (u == 1 && v == 3) return 1;
        if (u == 2 && v == 3) return 3;
        if (u == 2 && v == 4) return 5;
        if (u == 3 && v == 4) return 1;
        if (u == 3 && v == 5) return 2;
        if (u == 4 && v == 5) return 3;
        return 0;
    }
}
