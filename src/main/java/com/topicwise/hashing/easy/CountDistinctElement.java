package com.topicwise.hashing.easy;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElement {
    public static int distinct(int [] arr){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        return set.size();
    }
    public static void main(String [] arr){
        int [] array = {1,3,3,2,4,5,6,2,7};
        System.out.println("The distinct elements are : " +distinct(array));
    }
}
