package com.topicwise.string.easy;

import java.util.Stack;

public class Palindrome {
    /*
    "A man, a plan, a canal: Panama"
    o/p : 1

    "race a car"
    o/p : 0

    ascii of capital letters 65 to 90
    ascii of lower letters 97 to 122
     */

    public static int isPalindrome(String str)
    {
        str = str.toLowerCase();
        Stack<Integer> charAscii = new Stack<>();
        String resStr = "";
        for(int i = 0; i < str.length() ; i++)
        {
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
            {
                charAscii.push((int)str.charAt(i));
                resStr = resStr + str.charAt(i);
            }
        }
        System.out.println("The String after removing the space and special char : "+ resStr);
        for(int i=0; i < resStr.length(); i++)
        {
            if(charAscii.isEmpty() || (int)resStr.charAt(i) != charAscii.peek())
            {
                return 0;
            }
            charAscii.pop();
        }

        return 1;
    }

    public static void main(String [] arr)
    {
        System.out.println("check if 'A man, a plan, a canal: Panama' is palindrome : "
                +isPalindrome("A man, a plan, a canal: Panama"));
    }
}
