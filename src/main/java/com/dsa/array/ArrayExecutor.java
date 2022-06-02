package com.dsa.array;

public class ArrayExecutor {
    public static void main(String [] arr)
    {
        int [] larNum = {3,30,34,5,9};
        String res = CreateLargeNumberFromArray.largestNumber(larNum);
        System.out.println("The larget number = "+ res);

        int [] moveNumber = {2, 1, 2, 2, 2, 3, 4, 2};
        int toMove = 2;
        System.out.println("The given array is " );
        PrintArray.print(moveNumber);
        System.out.println(" , toMove = "+toMove+ ", array after moving "+ toMove);
        MoveNumberToEndOfArray.moveAllInstancesToEnd(moveNumber, toMove);
    }
}
