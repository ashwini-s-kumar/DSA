package com.topicwise.graph.directed;

import java.util.ArrayList;
import java.util.Stack;

public class DfsTarjanStronglyConnectedComponent {
    private int v;
    private static int Nil = -1;

    private static int time;

    private ArrayList<ArrayList<Integer>> graph;

    public DfsTarjanStronglyConnectedComponent(int v) {
        this.v = v;
        this.time = 0;
        graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
    }

    private void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    private void tarjan() {
        boolean[] visited = new boolean[v];
        int[] discoveryTime = new int[v];
        int[] low = new int[v];
        int[] parent = new int[v];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < v; i++) {
            parent[i] = Nil;
            visited[i] = false;
        }

        for (int u = 0; u < v; u++) {
            if (!visited[u]) {
                scc(u, visited, discoveryTime, low, parent,stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    private void scc(int u, boolean[] visited, int[] discoveryTime, int[] low, int[] parent, Stack<Integer> stack) {

        visited[u] = true;
        discoveryTime[u] = low[u] = ++time;
        stack.add(u);
        for (int v : graph.get(u)) {
            if (!visited[v]) {
                parent[v] = u;

                scc(v, visited, discoveryTime, low, parent,stack);

                low[u] = Math.min(low[u], low[v]);

            } else if (v != parent[u]) {
                low[u] = Math.min(low[u], discoveryTime[v]);
            }
        }
        System.out.println(" ");
        if (low[u] == discoveryTime[u]) {
            System.out.print(stack.pop() + " ");
        }
    }


    public static void main(String args[]) {
        // Create graphs given in above diagrams
        System.out.println("Scc in first graph ");
        DfsTarjanStronglyConnectedComponent g = new DfsTarjanStronglyConnectedComponent(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        System.out.println("SSC in the graph ");
        g.tarjan();
    }
}
