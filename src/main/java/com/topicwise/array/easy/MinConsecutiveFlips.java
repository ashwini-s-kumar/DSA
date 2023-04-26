package com.topicwise.array.easy;

import com.topicwise.array.PrintArray;

public class MinConsecutiveFlips {

    public static void makeAllElementsSame(int [] arr){
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
    public static void main(String [] arr){
        System.out.println(" ");
        System.out.print(" The given array : ");
        int [] arr14 = { 1, 1, 0, 0, 0, 1,1,0};
        PrintArray.print(arr14);
        makeAllElementsSame(arr14);

    }
}
