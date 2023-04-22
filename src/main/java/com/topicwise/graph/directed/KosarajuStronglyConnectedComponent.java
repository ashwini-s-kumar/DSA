package com.topicwise.graph.directed;

import com.topicwise.graph.AdjacentListGraph;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajuStronglyConnectedComponent {
    private static Stack<Integer> stack = new Stack<>();

    private static void printDfs(ArrayList<ArrayList<Integer>> adj, int u, boolean [] visited){
        visited[u] = true;
        System.out.print(u + " ");
        for(int v: adj.get(u)){
            if(!visited[v]) {
                printDfs(adj, v, visited);
            }
        }
    }

    private static void orderByFinishTime(ArrayList<ArrayList<Integer>> adj, int u, boolean [] visited)
    {
        // DFS traversal
        visited[u] = true;
        for(int v: adj.get(u)){
            if(!visited[v]) {
                orderByFinishTime(adj, v, visited);
            }
        }
        stack.push(u);
    }

    private static ArrayList<ArrayList<Integer>> getGraphTranspose(ArrayList<ArrayList<Integer>> adj, int v){
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            transpose.add(new ArrayList<>());
        }

        for(int i= 0 ; i < v; i++){
            for(int x : adj.get(i)){
                transpose.get(x).add(i);
            }
        }
        return transpose;
    }
    private static void printSCCs(ArrayList<ArrayList<Integer>> adj, int v){
        boolean [] visited = new boolean[v];

        for(int i = 0; i < v ; i++){
            if(!visited[i]) {
                orderByFinishTime(adj, 0, visited);
            }
        }

        ArrayList<ArrayList<Integer>> adjTranspose = getGraphTranspose(adj, v);

        visited = new boolean[v];

        while(!stack.isEmpty()){
            int u = stack.pop();
            if(!visited[u]){
                printDfs(adjTranspose, u, visited);
                System.out.println(" ");
            }
        }
    }

    public static void main(String args[])
    {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        AdjacentListGraph.insertEdgeDirected(adj, 1, 0);
        AdjacentListGraph.insertEdgeDirected(adj, 0, 2);
        AdjacentListGraph.insertEdgeDirected(adj, 2, 1);
        AdjacentListGraph.insertEdgeDirected(adj, 0, 3);
        AdjacentListGraph.insertEdgeDirected(adj, 3, 4);
        System.out.println(adj.toString());
        System.out.println(" ");

        printSCCs(adj, v);
    }

}
