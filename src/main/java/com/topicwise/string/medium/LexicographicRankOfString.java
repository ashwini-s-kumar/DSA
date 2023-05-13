package com.topicwise.string.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class LexicographicRankOfString {
    static int MOD = 1000000007;

    //Function to generate the list of factorials.
    static void initializeFactorials(int totalLen, ArrayList<Integer> fact)
    {
        long factorial = 1;
        fact.add((int)1);
        for (int curIndex = 1; curIndex < totalLen; curIndex++) {
            factorial = (factorial * curIndex) % MOD;
            fact.add((int)factorial);
        }
    }

    //Function to find lexicographic rank of a string.
    static long findRank(String S)
    {
        int charCount[] = new int[256];
        Arrays.fill(charCount, 0);

        //counting the characters of the string.
        for (int i = 0; i < S.length(); i++)
        {
            charCount[S.charAt(i)]++;
            //returning 0 if any character is repeated.
            if(charCount[S.charAt(i)]>1)
                return 0;
        }

        ArrayList<Integer> fact = new ArrayList<>();
        initializeFactorials(S.length() + 1, fact);

        long rank =  1;

        //iterating over the string.
        for (int i = 0; i < S.length(); i++)
        {
            int less = 0;
            for (int ch = 0; ch < S.charAt(i); ch++){
                less += charCount[ch];
            }

            //calculating the rank.
            rank = (rank+((long)fact.get(S.length()-i-1)*less))% MOD;
            //updating the character count.
            charCount[S.charAt(i)]--;
        }
        //returning the rank.
        return rank;
    }

    public static void main(String [] arr){

        System.out.println(findRank("abc"));
    }
}
/*
You are given a string S of lowercase characters, find the rank of the string amongst its permutations when sorted lexicographically. Return 0 if the characters are repeated in the string.
Note: Return the rank%1000000007 as the answer as rank might overflow.

Example 1:

Input:
S = abc
Output: 1
Explanation: In 'abc' when we sort all the
permutations in lexicographic order 'abc'
will be at the first position.

1.initialise a charCount array with zero.
2.Now run a loop and update the frequency of characters of string inside the charCount array.
3.Check if any character is repeated then return 0.
4.Now calculate and store the factorial of each index so that we can use it in next step.
5.Now initialise a rank =1.
6.Run a loop over each character of the string.
7.Check how many characters in the string are smaller than the current character of the string(let it's value is x)
8.Now update the rank as: rank = rank+(x*(n-i-1)!)%1e9+7.
9.Update the character count as charCount[S[i]]--.
10.Return the rank as the answer.


Let the given string be “STRING”. In the input string, ‘S’ is the first character.
   There are total 6 characters and 4 of them are smaller than ‘S’.
   So there can be 4 * 5! smaller strings where first character is smaller than ‘S’, like following
   R X X X X X
   I X X X X X
   N X X X X X
   G X X X X X
   Now let us Fix ‘S’ and find the smaller strings starting with ‘S’.
   Repeat the same process for T, rank is 4*5! + 4*4! +…
   Now fix T and repeat the same process for R, rank is 4*5! + 4*4! + 3*3! +…
   Now fix R and repeat the same process for I, rank is 4*5! + 4*4! + 3*3! + 1*2! +…
   Now fix I and repeat the same process for N, rank is 4*5! + 4*4! + 3*3! + 1*2! + 1*1! +…
   Now fix N and repeat the same process for G, rank is 4*5! + 4*4! + 3*3! + 1*2! + 1*1! + 0*0!
   Rank = 4*5! + 4*4! + 3*3! + 1*2! + 1*1! + 0*0! = 597
   Note that the above computations find count of smaller strings.
   Therefore rank of given string is count of smaller strings plus 1.
   The final rank = 1 + 597 = 598
 */