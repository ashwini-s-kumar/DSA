package com.topicwise.array.easy;

import java.util.Arrays;
import java.util.Comparator;

public class CreateLargeNumberFromArray {
    public static String largestNumber(final int[] A) {

        String[] arr = new String[A.length];
        for(int i=0; i<A.length; i++){
            arr[i]=String.valueOf(A[i]);
        }

        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            sb.append(s);
        }

        while(sb.charAt(0)=='0'&&sb.length()>1)
            sb.deleteCharAt(0);

        return sb.toString();

    }
}
