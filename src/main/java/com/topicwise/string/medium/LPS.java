package com.topicwise.string.medium;

import com.topicwise.array.PrintArray;

public class LPS {
    // Longest Proper Prefix, which is also a suffix.

    public static int []  fillLPS(String str){
        int n = str.length();

        int [] lps = new int[n];
        int preLPS = 0;
        lps[0] = 0;

        int i = 1;
        while(i < n ){
            if(str.charAt(i) == str.charAt(preLPS)){
                preLPS++;
                lps[i] =  preLPS;
                i++;
            }
            else {
                if(preLPS == 0){
                    lps[i] = 0;
                    i++;
                }else {
                    preLPS = lps[preLPS-1];
                }
            }
        }

        return lps;
    }

    public static void main(String [] arr){
        PrintArray.print(fillLPS("aaaa"));
        PrintArray.print(fillLPS("abcd"));
        PrintArray.print(fillLPS("ababab"));
        PrintArray.print(fillLPS("abacab"));
    }
}
