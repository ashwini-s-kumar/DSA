package com.topicwise.array;

public class MaxConsecutive1sBinaryArray {
    // max continious 1's
    public int max1s(int [] a)
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
}
