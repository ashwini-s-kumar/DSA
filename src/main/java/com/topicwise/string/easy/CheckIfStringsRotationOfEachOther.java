package com.topicwise.string.easy;

public class CheckIfStringsRotationOfEachOther {

    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here

        if(s1.length() != s2.length()){
            return false;
        }

        String temp = s1+s1;

        int n = temp.length();
        int m = s2.length();

        for(int i = 0; i<= n-m ; i++){
            int j;
            for(j = 0; j < m ; j++){
                if(temp.charAt(i +j) != s2.charAt(j)){
                    break;
                }
            }
            if(j == m){
                return true;
            }
        }
        return false;
    }

    public static void main(String [] arr){
        System.out.println(areRotations("geeksforgeeks" ,"forgeeksgeeks"));
        System.out.println(areRotations("mightandmagic", "andmagicmigth"));
    }
}
