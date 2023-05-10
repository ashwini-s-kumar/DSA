package com.topicwise.string.easy;

import java.util.Arrays;

public class IsomorphicStrings {
    public static boolean areIsomorphic(String str1,String str2)
    {
        int size = 256;

        int m = str1.length();
        int n = str2.length();

        if(m != n)
            return false;

        //using a boolean array to mark visited characters in str2.
        Boolean[] marked = new Boolean[size];
        Arrays.fill(marked, Boolean.FALSE);

        //using map to store mapping of every character from str1 to
        //that of str2. Initializing all entries of map as -1.
        int[] map = new int[size];
        Arrays.fill(map, -1);

        for (int i = 0; i < n; i++)
        {
            //if current character of str1 is seen first time in map.
            if (map[str1.charAt(i)] == -1)
            {
                //if current character of str2 is already
                //seen, one to one mapping is not possible.
                if (marked[str2.charAt(i)] == true)
                    return false;

                //marking current character of str2 as visited.
                marked[str2.charAt(i)] = true;

                //storing mapping of current characters.
                map[str1.charAt(i)] = str2.charAt(i);
            }

            //if this isn't first appearance of current character in str1 then
            //checking if previous appearance mapped to same character of str2.
            else if (map[str1.charAt(i)] != str2.charAt(i))
                return false;
        }
        return true;
    }
    public static void main(String [] arr){
        System.out.println(areIsomorphic("aab", "xxy"));
        System.out.println(areIsomorphic("aab", "xyz"));
    }
}

/*
Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.
Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for
every character of str1 to every character of str2 while preserving the order.
Note: All occurrences of every character in str1 should map to the same character in str2

Example :

Input:
str1 = aab
str2 = xxy
Output: 1
Explanation: There are two different
charactersin aab and xxy, i.e a and b
with frequency 2and 1 respectively.


Input:
str1 = aab
str2 = xyz
Output: 0
Explanation: There are two different
charactersin aab but there are three
different charactersin xyz. So there
won't be one to one mapping between
str1 and str2.
 */