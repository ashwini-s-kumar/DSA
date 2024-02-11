package com.topicwise.matrix.easy;

public class Determinant {
  static int determinant(int [][] mat, int n){
    int d = 0, sign = 1;
    if(n == 1){
      return mat[0][0];
    }
    int [][] temp = new int[n][n];
    for(int i = 0; i < n ;  i++){
      coFactors(mat, temp,0, i, n);
      d += sign * mat[0][i] * determinant(temp, n-1);
      sign = -sign;
    }

    return d;
  }

  static void coFactors(int [][] mat , int [][] temp, int row, int col, int rowLength){
    int tempI =0, tempJ = 0;

    for(int i = 0; i < rowLength; i ++){
      for(int j = 0 ; j < rowLength; j++ ){

        if(i != row && j != col){
          temp[tempI][tempJ++] = mat[i][j];

          if(tempJ == rowLength -1){
            tempJ = 0;
            tempI ++;
          }

        }

      }
    }
  }
  public static void main(String [] arr){

    int matrix1[][] = {{1, 2, 3},
      {4, 5, 6},
      {7, 10, 9}};
    System.out.println("Determinant = " + determinant(matrix1, 3));

    int matrix2[][] = {{1, 0, 2, -1},
      {3, 0, 0, 5},
      {2, 1, 4, -3},
      {1, 0, 5, 0}};
    System.out.println("Determinant = " + determinant(matrix2, 4));
  }
}
