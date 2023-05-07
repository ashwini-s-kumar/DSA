package com.topicwise.string.easy;

import java.util.Arrays;

public class LeftMostRepeating {
    private static int repeating(String str)
    {
        int [] firstIndex = new int[256];
        Arrays.fill(firstIndex, -1);
        int res = Integer.MAX_VALUE;

        for(int i = 0; i < str.length(); i++){
            int fIndex = firstIndex[str.charAt(i)];
            if(fIndex == -1){
                firstIndex[str.charAt(i)] = i;
            }
            else{
                res = Math.min(res, fIndex);
            }
        }
        return res;
    }

    public static void main(String [] arr){
        String str = "geeksforgeeks";
        System.out.println(repeating(str));
    }
}
