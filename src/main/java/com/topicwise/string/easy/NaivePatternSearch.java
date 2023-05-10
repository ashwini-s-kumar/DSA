package com.topicwise.string.easy;

import java.util.ArrayList;
import java.util.List;

public class NaivePatternSearch {

    // time : O((n1-n2+1) * n2)
    private static List<Integer> findAllIndex(String str, String subStr) {

        List<Integer> res = new ArrayList<>();

        int n = str.length();
        int m = subStr.length();

        for (int i = 0; i <=n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (str.charAt(i + j) != subStr.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                res.add(i);
            }
        }


        return res;
    }

    public static void main(String[] arr) {
        String str = "agekaakabgek";
        System.out.println(findAllIndex(str, "gek"));
        System.out.println(findAllIndex(str, "gab"));
        System.out.println(findAllIndex(str, "kab"));
        System.out.println(findAllIndex("ABABABCD", "ABAB"));

    }
}

