package com.topicwise.matrix.easy;

public class Rotate90Degree {
  static void rotate(int [][] a){
    // step 1 : transpose
    Transpose.transpose(a);
    //step 2 : reverse individual columns
    if(a.length == 1 ){
      return;
    }
    int lowRow = 0, highRow = a.length - 1;

    while(lowRow <= highRow){

      int col = a[ lowRow ].length;
      for(int i = 0; i < col; i++){
        int temp = a[lowRow][i];
        a[lowRow][i] = a[highRow][i];
        a[highRow][i] = temp;
      }
      lowRow ++;
      highRow --;

    }
  }
  public static void main(String [] arr){
    int[][] a = {
            {1, 2, 10},
            {3, 4, 20},
            {5, 6, 30}};
    rotate(a);
    PrintMatrix.printRowWise(a);
  }
}
