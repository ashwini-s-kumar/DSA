package com.topicwise.string.easy;

public class SumOfIntegerInString {
    public static long findSum(String str)
    {
        String temp = "0";
        int sum = 0;

        //iterating over the string.
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            //if current character is digit, we store it in a temporary string.
            if (Character.isDigit(ch))
                temp += ch;

            else
            {
                //incrementing final sum by number stored in temporary string.
                sum += Integer.parseInt(temp);
                //making the temporary string empty again.
                temp = "0";
            }
        }
        //adding any number if it's present in temporary
        //string to final sum and returning it.
        return sum + Integer.parseInt(temp);
    }

    public static void main(String [] arr){
        System.out.println(findSum("1abc23"));
    }
}
/*
Input:
str = 1abc23
Output: 24
Explanation: 1 and 23 are numbers in the
string which is added to get the sum as
24.
 */