package com.topicwise.hashing.medium.prefixSum;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithGivenSum {
    public static void findLength(int [] arr, int sum){
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int res = 0 ;
        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];

            if(prefixSum == sum){
                res =  Math.max(res, i + 1);
            }
            if(map.containsKey(prefixSum - sum)){
                res =  Math.max(res, i - map.get(prefixSum - sum));
            }
            map.put(prefixSum, i);
        }
        System.out.println("The longest subArray length with sum : "+ sum + " is " + res);
    }
    public static void main(String [] arr){
        int [] array = {3,4,1,-7,10,5,-1};
        findLength(array,15);
        findLength(array,1);
        findLength(array,6);
    }
}
