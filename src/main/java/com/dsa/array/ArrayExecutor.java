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
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        Leader leader = new Leader();
        MaxDifference maxDifference = new MaxDifference();
        Frequency frequency = new Frequency();
        StockBuySell stockBuySell = new StockBuySell();
        Max1sBinaryArray max1sBinaryArray = new Max1sBinaryArray();

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

        System.out.println(" ");
        System.out.print(" Second Largest in the given array : ");
        int [] arr3 = {30, 50, 70, 20, 90, 500, 420,40};
        printArray.print(arr3);
        System.out.print( " is : " + secondLargestNumber.secondLargest(arr3));

        System.out.println(" ");
        System.out.print(" Leaders of  the given array : ");
        int [] arr4 = {30, 2000, 70, 1000, 90, 500, 420,40};
        leader.printLeader(arr4);

        System.out.println(" ");
        System.out.print(" MaxDifference in  of   given array : ");
        printArray.print(arr4);
        System.out.print( " is : "+ maxDifference.maxDiff(arr4));

        System.out.println(" ");
        System.out.print(" Frequency of element in sorted array : ");
        int [] arr5 = {10,10,10,35,35,60,60,60,60,60,70,80,80};
        printArray.print(arr5);
        frequency.freSortedArray(arr5);

        System.out.println(" ");
        System.out.print(" Trade stocks with the price array : ");
        int price[] = {100, 180, 260, 310, 40, 535, 695};
        printArray.print(price);
        stockBuySell.stock(price);

        System.out.println(" ");
        System.out.print(" Max 1's in the binary array : ");
        int [] binary = {1,1,1,0,0,0,1,1,0,1,1,1,1,1,0,1};
        printArray.print(binary);
        System.out.print( " is : "+ max1sBinaryArray.max1s(binary));
    }
}
