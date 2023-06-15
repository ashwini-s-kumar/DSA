package com.topicwise.matrix.easy;

public class MultipleMatrix {
    //Function to multiply two matrices.
    /*
    Input:
n1 = 3, m1 = 2
A[][] = {{4, 8},
         {0, 2}
         {1, 6}}
n2 = 2, m2 = 2
B[][] = {{5, 2},
         {9, 4}}
Output: 92 40 18 8 59 26
     */
    static int[][] multiplyMatrix(int A[][], int B[][])
    {
        int r = A.length;
        int c = A[0].length;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                A[i][j] = A[i][j] * B[i][j];
            }
        }

        return A;
    }

    public static void main(String [] arr){
        int [][] mat1= {{4,8},
                {0,2},
                {1,6}};
        int [][] mat2 = {{5,2}};
    }
}
