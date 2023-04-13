package com.topicwise.array.medium.prefixSum;

public class EquilibriumPoint {
    private static void printEquilibrium(int [] arr){
        int rightPrefix = 0 ;
        for(int i = arr.length-1; i >= 0; i--){
            rightPrefix += arr[i];
        }
        int leftPrefix = 0;

        for(int i = 0; i < arr.length; i ++){
            if(leftPrefix == rightPrefix - arr[i]){
                System.out.println("The equilibrium point : " + i);
            }
            leftPrefix += arr[i];
        }
        System.out.println("No equilibrium point");
    }
}