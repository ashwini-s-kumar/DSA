package com.topicwise.searching.easy;

public class LastOccuranceSortedArray {
    public static int lastOccurance(int [] arr, int key){
        int l = 0, h = arr.length - 1, mid;
        while(l <= h){
            mid = (l + h) / 2;
            if(key < arr[mid]){
                h = mid -1;
            }else if(key > arr[mid]){
                l = mid + 1;
            }else{
                if(mid == arr.length -1 || arr[mid + 1] != arr[mid]){
                    return mid;
                }else{
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String [] arr){
        int [] array = {3,4,5,6,6,6,10,22,23,23,24};
        System.out.println(lastOccurance(array, 6));
        System.out.println(lastOccurance(array, 11));
        System.out.println(lastOccurance(array, 23));
        System.out.println(lastOccurance(array, 5));
    }
}
