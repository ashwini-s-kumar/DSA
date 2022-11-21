package com.interviewbit.array;

public class EquilibriumIndex {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int [] arr = {-7, 1, 5, 2, -4, 3, 0};
        //int[] arr = {1,2,3};
        int sum = 0;
        int result = -1;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            rightSum = sum - leftSum;
            if(leftSum == (rightSum-arr[i]))
            {
                result = i;
                break;
            }
            leftSum += arr[i];
        }
        System.out.println(result);
    }
}
