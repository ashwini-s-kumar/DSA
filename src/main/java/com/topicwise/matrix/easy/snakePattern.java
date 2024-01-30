package com.topicwise.matrix.easy;

public class snakePattern {
  static void printSnackPattern(int[][] arr){
    for(int i = 0; i < arr.length; i++){
      if(i % 2 == 0){
        for(int j = 0; j < arr[i].length ; j++){
          System.out.print(" " + arr[i][j]);
        }
      }else{
        for(int j = arr[i].length - 1; j >= 0 ; j--){
          System.out.print(" " + arr[i][j]);
        }
      }
      System.out.println(" ");
    }
  }

  public static void main(String [] arr){
    int [][] a = {{1,2} , {3,4}, {5,6}, {7,8}};
    printSnackPattern(a);
  }
}
