package com.topicwise.array.easy;

import com.topicwise.array.PrintArray;

public class MaxConsecutive1sBinaryArray {
    // max continious 1's
    public static int max1s(int [] a)
    {
        int max = 0, cur_max = 0;
        for(int i = 0; i < a.length ; i++) {
            if( a[i] == 0) {
                if(max < cur_max)
                    max = cur_max;
                cur_max = 0;
            }
            else
                cur_max ++;
        }
        return max;
    }

    public static void main(String [] arr){
        System.out.println(" ");
        System.out.print(" Max 1's in the binary array : ");
        int [] binary = {1,1,1,0,0,0,1,1,0,1,1,1,1,1,0,1};
        PrintArray.print(binary);
        System.out.println( " is : "+ max1s(binary));
    }
}
