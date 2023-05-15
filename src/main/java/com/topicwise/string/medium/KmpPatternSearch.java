package com.topicwise.string.medium;

import java.util.ArrayList;
import java.util.List;

public class KmpPatternSearch {
    private static List<Integer> search(String str, String pat){
        List<Integer> res = new ArrayList<>();
        int n = str.length();
        int m = pat.length();

        int [] lps = LPS.fillLPS(pat);
        int i = 0, j = 0;

        while(i<n ){
            if(str.charAt(i) == pat.charAt(j)){
                i ++;
                j ++;
            }
            if(j == m){
                res.add(i - j);
                j = lps[j-1];
            }else if( i < n && str.charAt(i) != pat.charAt(j)) {
                if(j == 0){
                    i++;
                }else{
                    j = lps[j-1];
                }
            }
        }

        return res;
    }

    public static void main(String [] arr){
        System.out.println(search("geekforgeek", "geek"));
    }
}
