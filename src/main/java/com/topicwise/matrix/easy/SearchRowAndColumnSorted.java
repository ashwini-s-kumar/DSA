package com.topicwise.matrix.easy;

public class SearchRowAndColumnSorted {

  static boolean search(int [][] a, int key){
    int rows = a.length , cols = a[0].length;
    int r=0, c=cols-1;
    while(r < rows && c>= 0 && c < cols){
      if(a[r][c] == key){
        return true;
      }
      else if(a[r][c] < key){
        r ++;
      }
      else if(a[r][c] > key){
        c --;
      }
    }

    return false;
  }

  public static void main(String [] arr){
    int[][] a = {
            {12, 13, 16, 30},
            {22, 23, 31, 33},
            {27, 28, 42, 51},
            {29, 30, 50, 55}
            };
    System.out.println("Found : " + search(a, 42));
    System.out.println("Found : " + search(a, 26));
  }
}
