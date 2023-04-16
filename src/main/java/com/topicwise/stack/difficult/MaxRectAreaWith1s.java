package com.topicwise.stack.difficult;

public class MaxRectAreaWith1s {
    public static void maxArea(int [][] arr, int row, int col){
        MaxRectAreaHistogram histogram = new MaxRectAreaHistogram();

        int res = histogram.maxArea(arr[0]);

        for(int i = 1; i < row; i++){

            for(int j = 0; j < col ; j ++){
                if(arr[i][j] == 1){
                    arr[i][j] += arr[i-1][j];
                }
            }

            res = Math.max(res, histogram.maxArea(arr[i]));
        }

        System.out.println(" Max area of rectangle all 1s : "+ res);
    }

    public static void main(String [] arr){
        int row = 4;
        int col = 4;

        int array[][] = {
                { 0, 1, 1, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 0 },
        };
        maxArea(array, row, col);
    }
}
