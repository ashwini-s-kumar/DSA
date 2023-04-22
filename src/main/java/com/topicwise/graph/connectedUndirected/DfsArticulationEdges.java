package com.topicwise.graph.connectedUndirected;

import java.util.ArrayList;

public class DfsArticulationEdges {
    private int v;
    private static int Nil = -1;

    private static int time;

    private ArrayList<ArrayList<Integer>> graph;

    public DfsArticulationEdges(int v){
        this.v = v;
        this.time = 0 ;
        graph = new ArrayList<>();
        for(int i = 0; i < v ; i ++){
            graph.add(new ArrayList<>());
        }
    }

    private void addEdge(int u , int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    private void edge(){
        boolean [] visited = new boolean[v];
        int [] discoveryTime = new int[v];
        int [] low = new int[v];
        int [] parent = new int[v];

        for(int i = 0; i < v;  i++){
            parent[i] = Nil;
            visited[i] = false;
        }

        for(int u = 0; u < v;  u++){
            if(!visited[u]) {
                articulationEdge(u, visited, discoveryTime, low, parent);
            }
        }
    }

    private void articulationEdge(int u, boolean [] visited, int [] discoveryTime, int [] low, int [] parent){

        visited[u] = true;
        discoveryTime[u] = low[u] = ++time;

        for(int v : graph.get(u)){
            if(!visited[v]) {
                parent[v] = u;

                articulationEdge(v, visited, discoveryTime, low, parent);

                low[u] = Math.min(low[u], low[v]);

                if(low[v] > discoveryTime[u]){
                    System.out.println(u +" --> "+ v);
                }
            }else if(v != parent[u]) {
                low[u] = Math.min(low[u], discoveryTime[v]);
            }
        }
    }


    public static void main(String args[])
    {
        // Create graphs given in above diagrams
        System.out.println("Bridges in first graph ");
        DfsArticulationEdges g1 = new DfsArticulationEdges(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        g1.edge();
        System.out.println();

        System.out.println("Bridges in Second graph");
        DfsArticulationEdges g2 = new DfsArticulationEdges(4);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);
        g2.addEdge(2, 3);
        g2.edge();
        System.out.println();

        System.out.println("Bridges in Third graph ");
        DfsArticulationEdges g3 = new DfsArticulationEdges(7);
        g3.addEdge(0, 1);
        g3.addEdge(1, 2);
        g3.addEdge(2, 0);
        g3.addEdge(1, 3);
        g3.addEdge(1, 4);
        g3.addEdge(1, 6);
        g3.addEdge(3, 5);
        g3.addEdge(4, 5);
        g3.edge();
    }
}
