package com.topicwise.matrix.easy;

public class AddMatrix {
    /*
    Input:
n1 = 2, m1 = 3
A[][] = {{1, 2, 3},
         {4, 5, 6}}

n2 = 2, m2 = 3
B[][] = {{1, 3, 3},
         {2, 3, 3}}

Output: 2 5 6 6 8 9
     */

    static int [][] matrixSum(int [][] A, int [][] B){

        int r = A.length;
        int c = A[0].length;


        for(int i = 0; i < r; i++){
            for(int j = 0; j< c; j++){
                A[i][j] = A[i][j] + B[i][j];
            }
        }

        return A;
    }

    public static void main(String [] arr){
        int r= 2, c= 3;
        int [][] matrix1={{1,2,3},
                {4,5,6}};

        int [][] matrix2={{1,3,3},
                {2,3,3}};
        int [][] sum = matrixSum(matrix1, matrix2);

        for(int i = 0; i < r; i++){
            for(int j = 0; j< c; j++){
                System.out.print(sum[i][j] + " ");
            }
        }
    }
}
