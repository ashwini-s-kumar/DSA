package com.topicwise.matrix.easy;

public class MagicSquare {

    public static boolean ismagicSquare(int [][] arr){
        int priDiaSum = 0, secDiaSum = 0, n = arr.length;

        for(int i = 0; i < n; i++){
            priDiaSum += arr[i][i];
            secDiaSum += arr[i][n - 1 -i];
        }
        if(priDiaSum != secDiaSum){
            return false;
        }

        int rowsum ,colSum ;
        for(int i = 0; i< n ; i++){
            rowsum = 0;
            colSum = 0;
            for(int j = 0 ; j < n ; j++){
                rowsum += arr[i][j];
                colSum += arr[j][i];
            }

            if(rowsum != colSum){
                return false;
            }
        }

        return true;
    }
    public static void main(String [] arr){
        int [][] matric = {{2, 7, 6},
                            {9, 5, 1},
                            {4, 3, 8}};
        boolean res = ismagicSquare(matric);
        if(res){
            System.out.println("It is a magic matrix !");
        }else{
            System.out.println("Not a magic matrix.");
        }
    }
}
