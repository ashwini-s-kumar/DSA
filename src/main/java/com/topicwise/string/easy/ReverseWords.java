package com.topicwise.string.easy;

import java.util.Stack;

public class ReverseWords {

    //Space = O(n)
    private static String reverse(String str){
        Stack<String> words = new Stack<>();

        int lastSpace = 0;
        for(int i = 0; i <str.length(); i++){
            if(str.charAt(i) == ' '){
                words.push(str.substring(lastSpace, i));
                lastSpace = i + 1;
            }
        }
        words.push(str.substring(lastSpace,str.length()));

        str = "";
        while(!words.isEmpty()){
            str += words.pop() +" ";
        }
        str = str.substring(0, str.length() -1);

        return str;
    }



    private static String efficientReverse(String str){
        char [] characters = str.toCharArray();
        ReverseString reverseString = new ReverseString();

        int lastSpace = 0;
        for(int i = 0; i < characters.length; i++){
            if(characters[i] == ' '){
                reverseString.reverse(characters, lastSpace, i-1);
                lastSpace = i+1;
            }
        }

        reverseString.reverse(characters, lastSpace, characters.length - 1);
        reverseString.reverse(characters, 0 , characters.length - 1);
        return  String.copyValueOf(characters);
    }



    public static void main(String [] arr){
        String str = "The cake is tasty";
        System.out.println(reverse(str));
        System.out.println(efficientReverse(str));
    }
}
