package com.dsa.array;

import com.dsa.array.patterns.PascalTriangle;

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

        PascalTriangle pascalTriangle = new PascalTriangle();
        System.out.println("print full pascal triangle with row : 6");
        pascalTriangle.print(25);

        System.out.println("print row pascal triangle with row : 6");
        int [] row = pascalTriangle.getRow(25);
        for(int i=0;i<row.length;i++)
        {
            System.out.print(row[i]+" ");
        }

    }
}
