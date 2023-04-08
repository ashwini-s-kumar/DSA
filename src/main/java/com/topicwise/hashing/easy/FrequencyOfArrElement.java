package com.topicwise.hashing.easy;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrElement {
    public static void frequency(int [] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
    }

    public static void main(String [] arr){
        int [] array = { 2,3,4,5,3,3,4,4,4,8,1,9};
        frequency(array);
    }
}
