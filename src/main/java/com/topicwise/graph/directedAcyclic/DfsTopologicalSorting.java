package com.topicwise.graph.directedAcyclic;

import com.topicwise.graph.AdjacentListGraph;

import java.util.ArrayList;
import java.util.Stack;

public class DfsTopologicalSorting {

    private static int v = 5;
    public static boolean [] visited = new boolean[v];

    public static Stack<Integer> stack = new Stack<>();
    public static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int v){
        for(int i = 0; i < v; i++){
            if(!visited[i]) {
                dfs(adj, i);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
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

        AdjacentListGraph.insertEdgeDAG(adj, 0, 1);
        AdjacentListGraph.insertEdgeDAG(adj, 1, 2);
        AdjacentListGraph.insertEdgeDAG(adj, 3, 4);
        AdjacentListGraph.insertEdgeDAG(adj, 3, 2);
        System.out.println(adj.toString());
        System.out.println(" ");

        topologicalSort(adj, v);
    }
}

