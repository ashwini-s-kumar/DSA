package com.topicwise.recursion.easy;

import java.util.Set;

public class NumberOfSubSetsWithSum {
    private static int countSubsets(int n, int sum, int [] arr){
        if(n == 0){
            return sum == 0? 1 : 0;
        }
        return countSubsets(n-1, sum, arr) + countSubsets(n-1, sum - arr[n-1], arr);
    }


    public static void main (String[] args) {

        int n = 4, arr[]= {5, 10, 20, 15}, sum = 20;

        System.out.println(countSubsets(n, sum, arr));

    }
}
