package com.topicwise.array.easy;

public class MinConsecutiveFlips {

    public void makeAllElementsSame(int [] arr){
        int res = 0;
        for(int i = 1 ; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                res++;
            }
        }
        if(res % 2 != 0){
            res++;
        }
        res = res/2;
        System.out.println("The minimum flips to make all elements same in array : " + res);
    }
}
