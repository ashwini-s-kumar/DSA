package com.topicwise.matrix.easy;

import com.topicwise.array.easy.LowerAndUpperBound;

public class MedianRowWiseSorted {

  // O(log 10^9) * O(n* log m) = O(  )

  static int median(int [][] a){
    // O(n* log m)
    int rows= a.length, cols = a[0].length;
    int  reqSmallerEquals = (rows * cols) /2, smallerEquals = 0;
    int  min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, mid = 0;
    for( int i = 0 ; i < rows ; i++){
      min = Math.min(min, a[i][0]);
      max = Math.max(max, a[i][cols-1]);
    }

    // O(log 10^9)
    while(min <= max){
      mid = (min + max) / 2;
      smallerEquals = getSmallerEquals(a, mid, rows, cols);
      if(smallerEquals <= reqSmallerEquals){
        min = mid + 1;
      }
      else {
        max = mid - 1;
      }
    }

    return min;
  }

  private static int getSmallerEquals(int [][] a, int mid, int row, int col){
    // O(n* log m)
    int smallerEquals = 0;
    for(int i = 0; i < row; i++){
      smallerEquals += LowerAndUpperBound.upperBound(a[0], mid);
    }
    return smallerEquals;
  }
  public static void main(String [] arr){
    int[][] a = {
            {1, 5, 7, 9, 11},
            {2, 3, 4, 5, 10},
            {9, 10, 12, 14 , 16}
            };
   System.out.println("median : " + median(a));
  }
}
