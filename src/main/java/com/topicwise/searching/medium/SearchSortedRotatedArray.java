package com.topicwise.searching.medium;

public class SearchSortedRotatedArray {
    public static int search(int [] arr, int key){
        int l = 0, h = arr.length -1, mid;
        while(l <= h){
            mid = ( l + h) / 2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[l] < arr[mid]){
                // left is sorted
                if(key >= arr[l] && key < arr[mid]){
                    h = mid -1;
                }else{
                    l = mid +1;
                }
            }else{
                // right is sorted
                if(key >= arr[mid] && key <= arr[h]){
                    l = mid +1;
                }else{
                    h = mid -1;
                }
            }
        }
        return -1;
    }

    public static void main(String [] arr){
        int [] array = {10, 20, 30, 40 , 50 , 8, 9};
        System.out.println(search(array, 8));
        System.out.println(search(array, 20));
    }
}
