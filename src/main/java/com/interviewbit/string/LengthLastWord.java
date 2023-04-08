package com.interviewbit.string;

public class LengthLastWord {
    public static int lengthLastWord(String str)
    {
        int len = 0;
        if(str.length() == 0)
        {
            return 0;
        }
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                len = 0;
                continue;
            }
            len +=1 ;
        }

        return len;
    }

    public static void main(String [] arr)
    {
        System.out.println("The length of last word : " + lengthLastWord(" A Apple a day"));
    }
}
