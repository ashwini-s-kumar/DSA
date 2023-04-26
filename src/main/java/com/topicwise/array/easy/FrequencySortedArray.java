package com.topicwise.array.easy;

import com.topicwise.array.PrintArray;

public class FrequencySortedArray {
    public static void freSortedArray(int [] arr)
    {
        int fre = 1, i = 1;
        while(i < arr.length) {
            while(i < arr.length && arr[i] == arr[i-1]) {
                fre++;
                i++;
            }
            System.out.print("ele "+arr[i-1]+" : "+fre +", " );
            fre=1;
            i++;
        }
    }

    public static void main(String [] arr){
        System.out.println(" ");
        System.out.print(" Frequency of element in sorted array : ");
        int [] arr5 = {10,10,10,35,35,60,60,60,60,60,70,80,80};
        PrintArray.print(arr5);
        freSortedArray(arr5);
    }
}
