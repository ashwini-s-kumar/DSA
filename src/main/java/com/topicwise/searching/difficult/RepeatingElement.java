package com.topicwise.searching.difficult;

public class RepeatingElement {
    /*
    - only one element is repeated
    - 0 is always present
    - unsorted
    - All elements from 0 to max are present
     */
    public static int repeated(int [] arr){
        int slow = arr[0], fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);
        slow = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast] ;
        }
        return slow;
    }

    public static void main(String [] arr){
        int [] array = {1,3,2,4,6,5,7,3};
        System.out.println(repeated(array));
    }

}
