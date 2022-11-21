package com.topicwise.array;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {
    void union(int [] arr1, int [] arr2)
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

    void intersection(int [] arr1, int [] arr2)
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
}
