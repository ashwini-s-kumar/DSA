package com.topicwise.graph.weighted;

import com.topicwise.graph.AdjacentListGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DijkstraShortestPath {
    private static int v = 4;

    private static ArrayList<ArrayList<Integer>> adjDirected = new ArrayList<>();

    private static ArrayList<ArrayList<Integer>> adjUndirected = new ArrayList<>();



    public static int minWeightVertex(int [] key, boolean [] finalized){
        int min = Integer.MAX_VALUE;
        int minVertex = -1;
        for(int i = 0; i < v ; i++){
            if(!finalized[i] && key[i] < min){
                min =  key[i];
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void dijkstraAlgo(ArrayList<ArrayList<Integer>> adj){
        int res = 0;
        int [] dist = new int[v];
        boolean [] finalised = new boolean[v];
        Map<Integer, Integer> vertexParentMap = new HashMap<>();
        vertexParentMap.put(0, 0);

        for(int i = 0; i < v; i++){
            dist[i] = Integer.MAX_VALUE;
        }

        dist[0] = 0;

        for(int i = 0; i < v; i++){
            int u = minWeightVertex(dist, finalised);
            finalised[u] = true;

            res += dist[u];

            for(int v : adj.get(u)){
                if(!finalised[v] && dist[u] + weight(u, v ) < dist[v]){
                    dist[v] = weight(u, v);
                    vertexParentMap.put(v, u);
                }
            }

        }
        System.out.println(res);

        for(Map.Entry<Integer, Integer> entry : vertexParentMap.entrySet()){
            System.out.println(entry.getValue() +" ---> " + entry.getKey() +" = " + dist[entry.getKey()]);
        }

    }

    public static void main(String [] arr){

        for (int i = 0; i < v; i++){
            adjDirected.add(i , new ArrayList<>());
        }

        AdjacentListGraph.insertEdgeDAG(adjDirected, 0, 1);
        AdjacentListGraph.insertEdgeDAG(adjDirected, 0, 2);
        AdjacentListGraph.insertEdgeDAG(adjDirected, 1, 2);
        AdjacentListGraph.insertEdgeDAG(adjDirected, 1, 3);
        AdjacentListGraph.insertEdgeDAG(adjDirected, 2, 3);

        System.out.println(adjDirected.toString());
        System.out.println(" ");


        dijkstraAlgo(adjDirected);

        System.out.println("======================================= ");


        for (int i = 0; i < v; i++){
            adjUndirected.add(i , new ArrayList<>());
        }

        AdjacentListGraph.insertEdge(adjUndirected, 0, 1);
        AdjacentListGraph.insertEdge(adjUndirected, 0, 2);
        AdjacentListGraph.insertEdge(adjUndirected, 1, 2);
        AdjacentListGraph.insertEdge(adjUndirected, 1, 3);
        AdjacentListGraph.insertEdge(adjUndirected, 2, 3);

        System.out.println(adjUndirected.toString());
        System.out.println(" ");

        dijkstraAlgo(adjUndirected);
    }

    private static int weight(int u, int v) {
        // return the weight of the edge (u, v)
        // or Integer.MAX_VALUE if the edge doesn't exist
        if (u == 0 && v == 1) return 5;
        if (u == 0 && v == 2) return 8;
        if (u == 1 && v == 2) return 10;
        if (u == 1 && v == 3) return 15;
        if (u == 2 && v == 3) return 20;
        return 0;
    }

}
