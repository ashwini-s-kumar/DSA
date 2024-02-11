package com.topicwise.matrix.easy;

public class Transpose {
  static void transpose(int[][] arr){
    int temp = 0;
    for(int i = 0; i < arr.length; i++){
      for(int j = i+1 ; j < arr[i].length; j ++){
        temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
  }

  public static void main(String [] arr) {
    int[][] a = {
                {1, 2, 10},
                {3, 4, 20},
                {5, 6, 30}};
    transpose(a);
    PrintMatrix.printRowWise(a);
  }
}
