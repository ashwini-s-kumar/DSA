package com.topicwise.matrix.easy;

public class BooleanMatrix {
  /*
  Given a boolean matrix of size RxC where each cell contains either 0 or 1,
  modify it such that if a matrix cell matrix[i][j] is 1
  then all the cells in its ith row and jth column will become 1.

  Expected Time Complexity: O(R * C)
  Expected Auxiliary Space: O(R + C)
   */
  static void booleanMatrix(int matrix[][])
  {
    int rows = matrix.length, cols = matrix[0].length;
    boolean [] row = new boolean[rows];
    boolean [] col = new boolean[cols];

    for(int i = 0; i < rows; i ++){
      for(int j = 0; j < cols ; j ++){
        if(matrix[i][j] == 1){
          row[i] = true;
          col[j] = true;
        }
      }
    }

    for(int i = 0; i < rows; i ++){
      for(int j = 0; j < cols ; j ++){
        if(row[i] || col[j]){
          matrix[i][j] = 1;
        }
      }
    }

  }

  public static void main(String [] arr){
    int matrix[][] = {{ 1, 0, 0},
            { 1, 0, 0},
            { 1, 0, 0},
            { 0, 0, 0}};
    booleanMatrix(matrix);
    PrintMatrix.printRowWise(matrix);
  }
}
