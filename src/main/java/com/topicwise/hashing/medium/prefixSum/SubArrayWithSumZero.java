package com.topicwise.hashing.medium.prefixSum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubArrayWithSumZero {

    public static void isPresent(int [] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int start = 0;
        int end = -1;

        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];
            if(prefixSum == 0){
                start = 0;
                end = i;
                break;
            }
            if(map.containsKey(prefixSum)){
                start = map.get(prefixSum) + 1;
                end = i;
                break;
            }
            map.put(prefixSum, i);

        }
        if(end == -1){
            System.out.println("The sum 0 is not found");
        }else{
            System.out.println("The sum 0 is found between index : "+ start + " and " + end);
        }
    }
    public static void main(String [] arr){
        int [] array = {3,4,1,-5,-2,10,9,8};
        isPresent(array);
    }
}
