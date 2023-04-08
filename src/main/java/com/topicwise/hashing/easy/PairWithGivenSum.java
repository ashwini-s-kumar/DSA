package com.topicwise.hashing.easy;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {
    public static void isPresent(int [] arr, int sum){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if (set.contains(sum - arr[i])){
                System.out.println("The pair is : " + (sum-arr[i]) + " and " + arr[i]);
                return;
            }else{
                set.add(arr[i]);
            }
        }
        System.out.println("No such pair");
    }
    public static void main(String [] arr){
        int [] array = {10,20,30};
        isPresent(array, 5);
        isPresent(array,50);
    }
}
