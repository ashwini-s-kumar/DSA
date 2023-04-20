package com.topicwise.graph.weightedUnDirected;

import com.topicwise.graph.AdjacentListGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PrimsShortestPathSpanningTree {
    private static int v = 4;

    private static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();


    public static int minWeightVertex(int [] key, boolean [] mstSet){
        int min = Integer.MAX_VALUE;
        int minVertex = -1;
        for(int i = 0; i < v ; i++){
            if(!mstSet[i] && key[i] < min){
                min =  key[i];
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void primAlgo(){
        int res = 0;
        int [] dist = new int[v];
        boolean [] mstSet = new boolean[v];
        Map<Integer, Integer> vertexParentMap = new HashMap<>();
        vertexParentMap.put(0, 0);

        for(int i = 0; i < v; i++){
            dist[i] = Integer.MAX_VALUE;
        }

        dist[0] = 0;

        for(int i = 0; i < v; i++){
            int minVer = minWeightVertex(dist, mstSet);
            mstSet[minVer] = true;

            res += dist[minVer];

            for(int v : adj.get(minVer)){
                if(!mstSet[v] && weight(minVer, v ) < dist[v]){
                    dist[v] = weight(minVer, v);
                    vertexParentMap.put(v, minVer);
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
            adj.add(i , new ArrayList<>());
        }

        AdjacentListGraph.insertEdgeDAG(adj, 0, 1);
        AdjacentListGraph.insertEdgeDAG(adj, 0, 2);
        AdjacentListGraph.insertEdgeDAG(adj, 1, 2);
        AdjacentListGraph.insertEdgeDAG(adj, 1, 3);
        AdjacentListGraph.insertEdgeDAG(adj, 2, 3);
        System.out.println(adj.toString());
        System.out.println(" ");


        primAlgo();
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
