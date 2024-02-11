package com.topicwise.matrix.easy;

public class ReverseColumns {
  // last column will become the first column and so on.
  static void reverseCol(int matrix[][])
  {
    // code here
    int rows = matrix.length;
    int cols = matrix[0].length;

    int leftCol = 0, rightCol = cols-1;

    while(leftCol < rightCol){
      for(int i = 0; i < rows; i++){
        int temp = matrix[i][leftCol];
        matrix[i][leftCol] = matrix[i][rightCol];
        matrix[i][rightCol] = temp;
      }
      leftCol ++;
      rightCol --;
    }
  }
  public static void main(String [] arr){
    int matrix[][] = {{ 1,  2,  3},
      { 5,  6,  7},
      {11, 10,  9},
      {13, 14, 15}};
    // Output: 3 2 1 7 6 5 9 10 11 15 14 13
    reverseCol(matrix);
    PrintMatrix.printRowWise(matrix);
  }
}
