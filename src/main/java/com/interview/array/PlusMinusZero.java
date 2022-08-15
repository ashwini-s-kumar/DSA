package com.interview.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinusZero {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int pos =0 , neg = 0 , zero =0;
        for(int i = 0; i< arr.size(); i++)
        {
            if(arr.get(i) == 0)
                zero ++;
            else if(arr.get(i) > 0)
                pos++;
            else
                neg++;

        }
        System.out.println(String.format("%.6f", (pos*1.0)/arr.size()));
        System.out.println(String.format("%.6f", (neg*1.0)/arr.size()));
        System.out.println(String.format("%.6f", (zero*1.0)/arr.size()));
    }
    public static void main(String [] arr)
    {
        Integer [] array = {2,-3,0,4,1,5,-9,0,0};
        List<Integer> list = Arrays.asList(array);
        PlusMinusZero.plusMinus(list);
    }
}
