package com.topicwise.string.easy;

public class ReverseString {
    public void reverse(char [] chars, int low, int high){
        while(low <= high){
            Character c = chars[low];
            chars[low] = chars[high];
            chars[high] = c;
            low ++;
            high --;
        }
    }
}
