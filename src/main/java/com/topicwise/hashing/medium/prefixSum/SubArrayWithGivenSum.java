package com.topicwise.hashing.medium.prefixSum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubArrayWithGivenSum {

    public static void isPresent(int [] arr, int sum){
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int start = 0;
        int end = -1;
        for(int i = 0 ; i < arr.length ; i++){
            prefixSum += arr[i];
            if(prefixSum == sum){
                start = 0;
                end = i;
                break;
            }
            if(map.containsKey(prefixSum - sum)){
                start = map.get(prefixSum - sum) + 1;
                end = i;
            }
            map.put(prefixSum, i);
        }
        if(end == -1){
            System.out.println("The sum : " + sum + " Not found");
        }else{
            System.out.println("The sum : " + sum +" is found between index : " + start + " and " + end);
        }
    }
    public static void main(String [] arr){
        int [] array = {3,4,1,10,9};
        isPresent(array,15);
        isPresent(array,1);
        isPresent(array,6);
    }
}
