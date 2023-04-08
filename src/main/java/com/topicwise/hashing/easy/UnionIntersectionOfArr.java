package com.topicwise.hashing.easy;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionOfArr {
    private static void union(int [] arr1, int [] arr2)
    {
        Set<Integer> s = new HashSet<>();
        for(int i =0; i< arr1.length; i++)
        {
            s.add(arr1[i]);
        }
        for(int i =0; i< arr2.length; i++)
        {
            s.add(arr2[i]);
        }
        System.out.println(s);
    }

    private static void intersection(int [] arr1, int [] arr2)
    {
        Set<Integer> s = new HashSet<>();
        for(int i =0; i< arr1.length; i++)
        {
            s.add(arr1[i]);
        }
        for(int i =0; i< arr2.length; i++)
        {
            if(s.contains(arr2[i]))
                System.out.print(arr2[i] + " ");
        }
    }

    public static void main(String [] arr){
        int [] arr1 = {10,20,10,30,20};
        int [] arr2 = {20,10,10,40};

        union(arr1, arr2);
        intersection(arr1, arr2);
    }
}
