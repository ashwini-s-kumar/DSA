package com.topicwise.array.medium.prefixSum;

/*
an index such that sum of elements at lower indexes is equal to sum of elements at higher indexes.
 */
public class EquilibriumPoint {
    private static void printEquilibrium(int [] arr){
        int rightPrefix = 0 ;
        for(int i = arr.length-1; i >= 0; i--){
            rightPrefix += arr[i];
        }
        int leftPrefix = 0;

        for(int i = 0; i < arr.length; i ++){
            if(leftPrefix == rightPrefix - leftPrefix - arr[i]){
                System.out.println("The equilibrium point : " + i);
            }
            leftPrefix += arr[i];
        }
        System.out.println("No equilibrium point");
    }

    public static void main(String [] arr){
        int [] a = { 3, 2, 1, 7, 5,1};
        printEquilibrium(a);
    }
}
