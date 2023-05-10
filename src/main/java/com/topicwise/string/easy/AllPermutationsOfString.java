package com.topicwise.string.easy;

public class AllPermutationsOfString {
    private static void permutations(String s, int l , int r){
        if(l == r){
            System.out.print(s + " ");
        }
        for(int i = l; i <= r; i++){
            s = swap(s, l, i);
            permutations(s, l+1, r);
            s = swap(s, l, i);
        }
    }



    private static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    //permutations  = n! =
    // 3! = 3 * 2 * 1 = 6
    public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        permutations(str, 0, n-1);
    }
}
