package com.dsa.array;

public class ArrayExecutor {
    public static void main(String [] arr)
    {
        int [] larNum = {3,30,34,5,9};
        String res = CreateLargeNumberFromArray.largestNumber(larNum);
        System.out.println("The larget number = "+ res);
    }
}
