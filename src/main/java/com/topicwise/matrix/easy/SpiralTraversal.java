package com.topicwise.matrix.easy;

public class SpiralTraversal {
  // O(R*C)
  static void spiralTraversal(int [][] a){
    int rows = a.length, cols = a[0].length;
    if(rows == 1 || cols == 1){
      return;
    }
    int top = 0, right = cols-1, left = 0, bottom = rows -1;
    while(top <= bottom){
      for(int i = left ; i <= right ; i++){
        System.out.print(" " + a[top][i]);
      }
      top ++;

      for(int i = top ; i <= bottom ; i++){
        System.out.print(" " + a[i][right]);
      }
      right --;

      for(int i = right ; i >= left ; i--){
        System.out.print(" " + a[bottom][i]);
      }
      bottom --;

      for(int i = bottom ; i >= top ; i--){
        System.out.print(" " + a[i][left]);
      }
      left ++;
    }
  }
  public static void main(String [] arr){
    int[][] a = {
            {1, 2, 10},
            {3, 4, 20},
            {5, 6, 30}};
    spiralTraversal(a);
  }
}
