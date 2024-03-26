package com.topicwise.backtracking;

import com.topicwise.graph.AdjacentListGraph;

import java.util.ArrayList;
import java.util.Arrays;

public class MColoring {
  /*
  Time Complexity: O( N^M) (n raised to m)

  Space Complexity: O(N)
   */

  public static void main(String [] arr){
    int  numNodes = 4;
    int numColors = 2;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    for( int i = 0 ; i < numNodes; i++)
    {
      adj.add(new ArrayList<>());
    }

    AdjacentListGraph.insertEdge(adj, 0, 1);
    AdjacentListGraph.insertEdge(adj, 0, 2);
    AdjacentListGraph.insertEdge(adj, 0, 3);
    AdjacentListGraph.insertEdge(adj, 1, 2);
    AdjacentListGraph.insertEdge(adj, 1, 3);
    System.out.println(adj.toString());

    boolean res = isPossibleToColor(adj, numNodes, numColors);
    System.out.println("is coloring possible :" + res);
  }

  private static boolean isPossibleToColor(ArrayList<ArrayList<Integer>> adj, int numNodes, int numColors) {
    int [] colors = new int[numNodes];
    Arrays.fill(colors, 0);
    return colorGraph(adj, 0, colors, numColors, numNodes);
  }

  private static boolean colorGraph(ArrayList<ArrayList<Integer>> adj, int node, int[] colors, int numColors, int numNodes) {

    if(node == numNodes){
      return true;
    }
    for(int i = 1; i <= numColors; i++){
      if(isSafe(adj, node, i, colors)){
        colors[node] = i;
        if(colorGraph(adj, node+1, colors, numColors, numNodes)){
          return true;
        }
        colors[node] = 0;
      }
    }
    return false;
  }

  private static boolean isSafe(ArrayList<ArrayList<Integer>> adj, int node, int color, int[] colors) {
    for(int i : adj.get(node)){
      if(colors[i] == color){
        return false;
      }
    }
    return true;
  }
}
