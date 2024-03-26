package com.topicwise.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RatInMaze {
  /*
  Time : O( 4*( n^ 2) )
  space : O(n^2)
   */
  public static void main(String [] arr){
    int [][]maze = {{1,0,0,0},
            {1,1,0,1},
            {1,1,0,0},
            {0,1,1,1}};
    int [][]visited = {{0,0,0,0},
            {0,0,0,0},{0,0,0,0},{0,0,0,0}};
    List<String> res = new ArrayList<>();
    findPaths(0,0, maze, visited, res, "", maze.length);
    System.out.println(res);

    System.out.println("=========================");
    int [][]maze1 = {{1,0,0,0},
            {1,1,0,1},
            {1,1,0,0},
            {0,1,1,1}};
    int [][]visited2 = {{0,0,0,0},
            {0,0,0,0},{0,0,0,0},{0,0,0,0}};
    List<String> res2 = new ArrayList<>();
    findPathsEfficient(0,0, maze, visited2, res2, "", maze1.length);
    System.out.println(res2);

  }

  private static void findPathsEfficient(int i, int j, int[][] maze, int[][] visited2, List<String> res2, String path, int length) {
    if( i == length-1 && j == length-1){
      res2.add(path);
      return;
    }
    // D l R U : Lexicographic order
    int [] indI = {1, 0, 0, -1};
    int [] indJ = {0, -1, 1, 0};
    char [] direction = {'D', 'L', 'R', 'U'};

    for(int k = 0; k < 4; k++) {
      int nextI = i + indI[k];
      int nextJ = j + indJ[k];
      if (nextI >= 0 && nextJ >= 0 && nextI < length && nextJ < length &&
              nextI  < length && visited2[nextI][nextJ] != 1 && maze[nextI][nextJ] != 0) {
        visited2[i][j] = 1;
        findPathsEfficient(nextI, nextJ, maze, visited2, res2, path + direction[k], length);
        visited2[i][j] = 0;
      }
    }
  }

  private static void findPaths(int i, int j, int[][] maze, int[][] visited, List<String> res, String path, int length) {
    if( i == length-1 && j == length-1){
      res.add(path);
      return;
    }

    //Down
    if(i+1 < length && visited[i+1][j] !=1 && maze[i+1][j] != 0) {
      visited[i][j] = 1;
      findPaths(i+1, j, maze,visited, res, path+"D", length);
      visited[i][j] = 0;
    }

    //Left
    if(j-1 >= length && visited[i][j-1] != 1 && maze[i][j-1] != 0){
      visited[i][j] = 1;
      findPaths(i, j-1, maze,visited, res, path+"L", length);
      visited[i][j] = 0;
    }

    //Right
    if(j+1 < length && visited[i][j+1] != 1 && maze[i][j+1] != 0)
    {
      visited[i][j] = 1;
      findPaths(i, j+1, maze,visited, res, path+"R", length);
      visited[i][j] = 0;
    }

    //Up
    if(i-1 >= 0 && visited[i-1][j] != 1 && maze[i-1][j] != 0)
    {
      visited[i][j] = 1;
      findPaths(i-1, j, maze,visited, res, path+"U", length);
      visited[i][j] = 0;
    }
  }
}
