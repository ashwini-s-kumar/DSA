package com.topicwise.matrix.easy;

public class BoundaryTraversal {
  static void printBoundaryTraversal(int[][] arr){
    int row = arr.length, col = arr[0].length;
    if(row == 1){
      for(int i = 0; i < col ; i++){
        System.out.print(" "+ arr[0][i]);
      }
    }
    else if(col == 1){
      for(int i = 0; i < row ; i++){
        System.out.print(" "+ arr[i][0]);
      }
    }
    else{
      for(int i = 0; i < col; i++){
        System.out.print(" "+ arr[0][i]);
      }
      for(int i = 1; i < row ; i++){
        System.out.print(" "+ arr[i][col-1]);
      }
      for(int i = col - 2; i > 0 ; i--){
        System.out.print(" "+ arr[row - 1][i]);
      }
      for(int i = row - 1; i > 0 ; i--){
        System.out.print(" "+ arr[i][0]);
      }
    }
  }

  public static void main(String [] arr){
    int [][] a = {{1,2,10} ,
                  {3,4,20},
                  {5,6,30},
                  {7,8,40}};
    printBoundaryTraversal(a);
  }
}
