package com.interview.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedNumber {
    public static int repeatedNumber( int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++)
        {
            if(map.containsKey(A[i]))
                return A[i];
            else
                map.put(A[i], 1);
        }
        return -1;
    }
    public static void main(String [] arr)
    {
        int [] array = {2,-3,2,4,1,5,-9,0,0};
        int res = RepeatedNumber.repeatedNumber(array);
        System.out.println("repeated number :"+res);
    }
}
