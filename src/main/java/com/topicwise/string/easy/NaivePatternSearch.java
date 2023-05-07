package com.topicwise.string.easy;

import java.util.ArrayList;
import java.util.List;

public class NaivePatternSearch {

    // time : O((n1-n2+1) * n2)
    private static List<Integer> findAllIndex(String str, String subStr){

        List<Integer> res = new ArrayList<>();

        int i = 0, j = 0;
        int n1 = str.length(), n2 = subStr.length();

        while(i < n1 && j < n2){
            if(str.charAt(i) == subStr.charAt(j)){
                i++;
                j++;
                if(j == n2 -1){
                    int index = i - n2 + 1;
                    res.add(index);
                    i = index + 1;
                    j = 0;
                }
            }else{
                i++;
                j=0;
            }
        }

        return res;
    }

    public static void main(String [] arr){
        String str = "agekabgek";
        System.out.println(findAllIndex(str, "gek"));
        System.out.println(findAllIndex(str, "gab"));
        System.out.println(findAllIndex(str, "kab"));
        System.out.println(findAllIndex("ABABABCD", "ABAB"));

    }

    private static void printResult(List<Integer> res){
        if(!res.isEmpty()) {
            System.out.println(res);
        }else{
            System.out.println("Not Present");
        }
    }
}
