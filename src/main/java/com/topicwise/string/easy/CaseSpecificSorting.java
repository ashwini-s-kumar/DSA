package com.topicwise.string.easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CaseSpecificSorting {

    public static String caseSort(String str)
    {
        int n = str.length();
        int sn = 0;
        int cn = 0;

        List<Character> capArr = new ArrayList<>();
        List<Character> smallArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int ascii = str.charAt(i);
            if (ascii >= 65 && ascii <= 90) {
                capArr.add(str.charAt(i));
                cn++;
            } else {
                smallArr.add(str.charAt(i));
                sn++;
            }
        }

        capArr.sort(Comparator.comparingInt(c -> (int) c));
        smallArr.sort(Comparator.comparingInt(c -> (int) c));

        StringBuilder sb = new StringBuilder();
        int cCount = 0;
        int sCount = 0;

        for (int i = 0; i < n; i++) {
            int ascii = str.charAt(i);
            if (ascii >= 65 && ascii <= 90) {
                sb.append(capArr.get(cCount));
                cCount++;
            } else {
                sb.append(smallArr.get(sCount));
                sCount++;
            }
        }

        return sb.toString();
    }
    public static void main(String [] arr){
        System.out.println(caseSort("srbDKi"));
    }
}
/*
N = 6
S = srbDKi
Output: birDKs
Explanation: Sorted form of given string
with the same case of character will
result in output as birDKs.
 */