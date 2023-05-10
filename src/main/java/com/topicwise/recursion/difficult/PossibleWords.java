package com.topicwise.recursion.difficult;

import java.util.ArrayList;
import java.util.Collections;

public class PossibleWords {
    static String hash[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    //Function to find list of all words possible by pressing given numbers.
    static ArrayList<String> possibleWords(int a[], int N)
    {
        String str = "";
        for(int i = 0; i < N; i++)
            str += a[i];
        ArrayList<String> res = possibleWordsUtil(str);
        //arranging all possible strings lexicographically.
        Collections.sort(res);
        return res;

    }

    //recursive function to return all possible words that can
    //be obtained by pressing input numbers.
    static ArrayList<String> possibleWordsUtil(String str)
    {
        //if str is empty
        if (str.length() == 0) {
            ArrayList<String> baseRes = new ArrayList<>();
            baseRes.add("");

            //returning a list containing empty string.
            return baseRes;
        }

        //storing first character of str
        char ch = str.charAt(0);
        //storing rest of the characters of str
        String restStr = str.substring(1);

        //getting all the combination by calling function recursively.
        ArrayList<String> prevRes = possibleWordsUtil(restStr);
        ArrayList<String> Res = new ArrayList<>();

        String code = hash[ch - '0'];

        for (String val : prevRes) {

            for (int i = 0; i < code.length(); i++) {
                Res.add(code.charAt(i) + val);
            }
        }
        //returning the list.
        return Res;
    }

    public static void main(String [] arr){
        int [] a = {2,3,4};
        int N = 3;
        System.out.println(possibleWords(a, N));
    }
}
/*
Given a keypad as shown in the diagram, and an N digit number which is represented by array a[ ],
the task is to list all words which are possible by pressing these numbers.


Example 1:

Input: N = 3, a[] = {2, 3, 4}
Output:
adg adh adi aeg aeh aei afg afh afi
bdg bdh bdi beg beh bei bfg bfh bfi
cdg cdh cdi ceg ceh cei cfg cfh cfi
Explanation: When we press 2,3,4 then
adg, adh, adi, ... cfi are the list of
possible words.
 */