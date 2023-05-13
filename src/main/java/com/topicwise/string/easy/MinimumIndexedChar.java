package com.topicwise.string.easy;

import java.util.HashSet;
import java.util.Set;

public class MinimumIndexedChar {
    public static int minIndexChar(String str, String patt)
    {
        // Your code here

        Set<Character> c = new HashSet<>();

        for(int i = 0; i< patt.length(); i++){
            c.add((char) patt.charAt(i));
        }

        for(int i = 0; i< str.length(); i++){
            if(c.contains((char)str.charAt(i))){
                return i;
            }
        }
        return -1;
    }

    public static void main(String [] arr){
        System.out.println(minIndexChar("geeksforgeeks", "set"));
    }

}

/*
Given a string str and another string patt.
Find the minimum index of the character in str that is also
present in patt.


Example 1:

Input:
str = geeksforgeeks
patt = set
Output: 1
Explanation: e is the character which is
present in given str "geeksforgeeks"
and is also presen in patt "set". Minimum
index of e is 1.
 */
