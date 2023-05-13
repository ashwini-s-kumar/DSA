package com.topicwise.string.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveUncommonCharAndConcat {
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
        String res = "";
        int i;

        //using map to store all characters of s2 in map.
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        for (i = 0; i < s2.length(); i++)
            m.put(s2.charAt(i), 1);

        //finding characters of s1 that are not present in s2
        //and appending them to result.
        for (i = 0; i < s1.length(); i++)
            if (!m.containsKey(s1.charAt(i)))
                res += s1.charAt(i);
            else
                m.put(s1.charAt(i), 2);

        //finding characters of s2 that are not present in s1
        //and appending them to result.
        for (i = 0; i < s2.length(); i++)
            if (m.get(s2.charAt(i)) == 1)
                res += s2.charAt(i);

        if(res == "")
            res = "-1";

        //returning the result.
        return res;
    }

    public static void main(String [] arr){
        System.out.println(concatenatedString("aacdb", "gafd"));
    }
}


/*
Input:
s1 = aacdb
s2 = gafd
Output: cbgf
Explanation: The common characters of s1
and s2 are: a, d. The uncommon characters
of s1 and s2 are c, b, g and f. Thus the
modified string with uncommon characters
concatenated is cbgf.
 */