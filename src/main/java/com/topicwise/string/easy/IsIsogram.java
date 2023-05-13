package com.topicwise.string.easy;

import java.util.Arrays;

public class IsIsogram {
    static boolean isIsogram(String data){
        //Your code here

        int [] count = new int[256];
        Arrays.fill(count, -1);

        for(int i = 0; i < data.length(); i++){
            if(count[data.charAt(i)] != -1){
                return false;
            }else{
                count[data.charAt(i)] ++;
            }
        }
        return true;
    }

    public static void main(String [] arr){
        System.out.println(isIsogram("machine"));
    }
}
/*
Input:
S = machine
Output: 1
Explanation: machine is an isogram
as no letter has appeared twice. Hence
we print 1.
 */