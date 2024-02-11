package com.topicwise.matrix.easy;

import java.util.ArrayList;

public class UpperAndLowerTriangles {
  static ArrayList<Integer> sumTriangles(int matrix[][])
  {
    // code here
    int n = matrix.length;
    int dSum = 0, upperSum = 0, lowerSum = 0;
    ArrayList<Integer> res = new ArrayList<>();

    // diagonal sum
    for(int i = 0; i < n; i ++){
      dSum = dSum + matrix[i][i];
    }

    for(int i = 0; i < n; i ++){
      for(int j = 0 ; j < n; j++){
        if(i != j){
          if(i < j){
            upperSum += matrix[i][j];
          }
          if(i > j){
            lowerSum += matrix[i][j];
          }
        }
      }
    }

    res.add(upperSum + dSum);
    res.add(lowerSum + dSum);
    return res;
  }

  public static void main(String [] arr){
    int mat[][] = {{6, 5, 4},
      {1, 2, 5},
      {7, 9, 7}};
    System.out.print("UpperAndLowerTriangles : " + sumTriangles(mat));
  }
}
