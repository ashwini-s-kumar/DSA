package com.topicwise.matrix.easy;

public class PrintMatrix {
  public static void printLinear(int [][] arr){
    for(int i = 0 ; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        System.out.print(" " + arr[i][j]);
      }
    }
  }

  public static void printRowWise(int [][] arr){
    for(int i = 0 ; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        System.out.print(" " + arr[i][j]);
      }
      System.out.println(" ");
    }
  }
}
