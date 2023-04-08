package com.topicwise.array.slidingWindow;

import com.topicwise.array.PrintArray;

import java.util.HashMap;
import java.util.Map;

public class DistinctElementInEveryWindow {
    public void distinct(int [] arr, int k){
        Map<Integer, Integer> fre = new HashMap<>();
        int distinct = 0;
        int [] output = new int [arr.length - k + 1];

        for(int i = 0; i < k; i++){

            if(!fre.containsKey(arr[i])){
                distinct ++;
            }
            fre.put(arr[i], fre.getOrDefault(arr[i], 0)+1);
        }

        output[0] = distinct;
        for(int i = k; i < arr.length; i++){

            if(fre.get(arr[i-k]) == 1){
                distinct -= 1;
            }
            fre.put(arr[i-k], fre.get(arr[i-k]) -1);

            if(!fre.containsKey(arr[i]))
            {
                distinct ++;
            }
            fre.put(arr[i], fre.getOrDefault(arr[i], 0) +  1);
            output[i-k+1] = distinct;
        }
        System.out.println("Distinct element in every window of : "+ k +" is : ");
        PrintArray printArray = new PrintArray();
        printArray.print(output);
    }
}
