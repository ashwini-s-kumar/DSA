package com.topicwise.matrix.easy;

public class BeautifyMatrix {
  /*
  A beautiful matrix is a matrix in which the sum of elements in each row and column is equal.
  Given a square matrix of size NxN. Find the minimum number of operation(s) that are required to
  make the matrix beautiful. In one operation you can increment the value of any one cell by 1.

  Expected Time Complexity: O(N * N)
  Expected Auxiliary Space: O(N)

   */
   static int findMinOperation(int[][] matrix) {
    int N = matrix.length;
    int [] sumRow = new int [N];
    int [] sumCol = new int [N];
    int ops = 0;

    for(int i = 0; i < N ; i ++){
      for(int j = 0 ; j < N; j++){
        sumRow[i] += matrix[i][j];
        sumCol[j] += matrix[i][j];
      }
    }

    int maxSum = 0;
    for(int i = 0; i < N ; i++){
      maxSum = Math.max(maxSum, sumRow[i]);
      maxSum = Math.max(maxSum, sumCol[i]);
    }

    for (int i = 0, j = 0; i < N && j < N;) {

      int minDiff = Math.min(maxSum - sumRow[i],  maxSum - sumCol[j]);
      matrix[i][j] += minDiff;
      ops += minDiff;

      sumRow[i] += minDiff;
      sumCol[j] += minDiff;

      if(sumRow[i] == maxSum){
        ++ i;
      }
      if(sumCol[j] == maxSum){
        ++ j;
      }

    }
    return ops;

  }

  public static void main(String [] arr){
    int matrix[][] = {{1, 2, 3},
            {4, 2, 3},
            {3, 2, 1}};
    System.out.println("No of operations : " + findMinOperation(matrix));
  }
}
