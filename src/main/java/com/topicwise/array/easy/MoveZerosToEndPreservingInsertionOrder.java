package com.topicwise.array.easy;

import com.topicwise.array.PrintArray;

public class MoveZerosToEndPreservingInsertionOrder {

    private static void reorder(int [] arr){
        int count = 0;
        int n = arr.length;

        for(int i = 0; i< n ; i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }
        while(count < n){
            arr[count] = 0;
            count ++;
        }
    }

    public static void main(String [] arr){
        int [] a = { 5, 0, 2, 3, 0 , 9};
        reorder(a);
        PrintArray.print(a);
    }
}
