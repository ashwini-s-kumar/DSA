package com.dsa.array;

import com.dsa.array.patterns.PascalTriangle;

public class ArrayExecutor {
    public static void main(String [] arr)
    {
        PrintArray printArray = new PrintArray();
        ReverseArrayTwoPointer rev = new ReverseArrayTwoPointer();
        PascalTriangle pascalTriangle = new PascalTriangle();
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        RemoveDuplicatesSortedArray removeDupSortedArray = new RemoveDuplicatesSortedArray();

        int [] larNum = {3,30,34,5,9};
        System.out.println(" ");
        String res = CreateLargeNumberFromArray.largestNumber(larNum);
        System.out.println("The larget number = "+ res);
        int [] moveNumber = {2, 1, 2, 2, 2, 3, 4, 2};
        int toMove = 2;
        System.out.println("The given array is " );
        printArray.print(moveNumber);
        System.out.println(" , toMove = "+toMove+ ", array after moving "+ toMove);
        MoveNumberToEndOfArray.moveAllInstancesToEnd(moveNumber, toMove);

        System.out.println(" ");
        System.out.println("print full pascal triangle with row : 6");
        pascalTriangle.print(25);

        System.out.println(" ");
        System.out.println("print row pascal triangle with row : 6");
        int [] row = pascalTriangle.getRow(25);
        printArray.print(row);

        System.out.println(" ");
        System.out.print(" Reverse of the  array : ");
        int [] arr1 = {100, 90, 80, 70, 60, 50};
        printArray.print(arr1);
        System.out.print( " is : ");
        rev.reverseArray(arr1, 0, arr1.length-1);
        printArray.print(arr1);

        System.out.println(" ");
        System.out.print(" Left Rotate by 1 position of the  array : ");
        printArray.print(arr1);
        System.out.print( " is : ");
        leftRotateArray.leftRotateByOne(arr1);
        printArray.print(arr1);

        System.out.println(" ");
        System.out.print(" Left Rotate by d position of the  array : ");
        printArray.print(arr1);
        System.out.print( " is : ");
        leftRotateArray.leftRotateByDPos(arr1, 3);
        printArray.print(arr1);

        System.out.println(" ");
        System.out.print(" Remove Duplicates of the sorted array : ");
        int [] arr2 = {12, 17, 17, 23, 27, 35, 35, 46, 50, 60, 70, 70};
        printArray.print(arr2);
        System.out.print( " is : ");
        int newLength = removeDupSortedArray.removeDuplicates(arr2);
        printArray.print(arr2,newLength);
    }
}
