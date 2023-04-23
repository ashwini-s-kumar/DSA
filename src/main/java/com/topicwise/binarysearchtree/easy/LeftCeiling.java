package com.topicwise.binarysearchtree.easy;

import java.util.TreeSet;

public class LeftCeiling {
    public static void leftCeilArray(int [] arr){
        TreeSet<Integer> s = new TreeSet<>();
        s.add(arr[0]);
        System.out.print(" -1 "+ " ");

        for(int i = 1; i < arr.length; i++){
            if(s.ceiling(arr[i]) != null){
                System.out.print(s.ceiling(arr[i]) + " ");
            }else{
                System.out.print(" -1 "+ " ");
            }
            s.add(arr[i]);
        }
    }
    public static void main(String [] arr){
        int [] array = {2, 8, 30, 15, 25, 12};
        leftCeilArray(array);
    }
}
